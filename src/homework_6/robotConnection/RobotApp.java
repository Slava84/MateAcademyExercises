package homework_6.robotConnection;

public class RobotApp {

    public static void main(String[] args) {
        try {
            moveRobot(new RobotConnectionManagerImpl(), 5, 8);
        } catch (RobotConnectionException e) {
            e.getMessage();
        }
    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        for (int i = 0; i < 3; i++) {
            try (RobotConnection robotConnection = robotConnectionManager.getConnection()) {
                robotConnection.moveRobotTo(toX, toY);
                i = 3;
            } catch (RobotConnectionException e) {
                if (i == 2) {
                    throw new RobotConnectionException("З'єднання, нажаль, не відбулось!");
                }
            }
        }
    }
}
