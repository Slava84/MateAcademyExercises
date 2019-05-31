package may_28.robotMoves;

public class MoveAlongY implements Moveable {

    public void movingY(Robot robot, int toY) throws Exception {
        int stepsY = toY - robot.getY();
        if (stepsY > 0) {
            switch (robot.getDirection()) {
                case LEFT:
                    robot.turnRight();
                    stepByStep(robot, stepsY);
                    break;
                case RIGHT:
                    robot.turnLeft();
                    stepByStep(robot, stepsY);
                    break;
                case DOWN:
                    robot.turnRight();
                    robot.turnRight();
                    stepByStep(robot, stepsY);
                    break;
                case UP:
                    stepByStep(robot, stepsY);
            }
        } else if (stepsY < 0) {
            switch (robot.getDirection()) {
                case LEFT:
                    robot.turnLeft();
                    stepByStep(robot, stepsY);
                    break;
                case RIGHT:
                    robot.turnRight();
                    stepByStep(robot, stepsY);
                    break;
                case UP:
                    robot.turnLeft();
                    robot.turnLeft();
                    stepByStep(robot, stepsY);
                    break;
                case DOWN:
                    stepByStep(robot, stepsY);
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