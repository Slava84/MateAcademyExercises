package may_28.robotMoves;

public class RobotManagement {
    private static MoveAlongX moveAlongX = new MoveAlongX();
    private static MoveAlongY moveAlongY = new MoveAlongY();

    public static void main(String[] args) throws Exception {
        Robot robot = new Robot();

        moveRobot(robot, 5, 7);
        moveRobot(robot, 3, 0);
        System.out.println("x: " + robot.getX() + " y: " + robot.getY());
    }
    private static void moveRobot(Robot robot, int toX, int toY) throws Exception {
        moveAlongX.movingX(robot, toX);
        moveAlongY.movingY(robot, toY);
    }
}
