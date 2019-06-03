package robotMoves;

public class MoveAlongX implements Moveable {

    public void movingX(Robot robot, int toX) throws Exception {
        int stepsX = toX - robot.getX();
        if (stepsX > 0){
            switch (robot.getDirection()){
                case UP:
                    robot.turnRight();
                    stepByStep(robot, stepsX);
                    break;
                case DOWN:
                    robot.turnLeft();
                    stepByStep(robot, stepsX);
                    break;
                case LEFT:
                    robot.turnRight();
                    robot.turnRight();
                    stepByStep(robot, stepsX);
                    break;
                case RIGHT:
                    stepByStep(robot, stepsX);
            }
        } else if (stepsX < 0){
            switch (robot.getDirection()){
                case UP:
                    robot.turnLeft();
                    stepByStep(robot, stepsX);
                    break;
                case DOWN:
                    robot.turnRight();
                    stepByStep(robot, stepsX);
                    break;
                case RIGHT:
                    robot.turnLeft();
                    robot.turnLeft();
                    stepByStep(robot, stepsX);
                    break;
                case LEFT:
                    stepByStep(robot, stepsX);
            }
        } else return;
    }

    @Override
    public void stepByStep(Robot robot, int steps) throws Exception {
        if (steps < 0) steps = -steps;

        for (int i = 0; i < steps; i++) {
            robot.stepForward();
        }
    }
}
