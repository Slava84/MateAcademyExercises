package homework_5.robotConnection;

public class RobotApp {
    private static RobotConnection robotConnection;

    public static void main(String[] args) {
        try {
            moveRobot(new RobotConnectionManagerImpl(), 5, 8);
        } catch (RobotConnectionException e) {
            e.getMessage();
        }
    }

    private static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        for (int i = 0; i < 3; i++) {
            try {
                robotConnection = robotConnectionManager.getConnection();
                robotConnection.moveRobotTo(toX, toY);
                break;
            } catch (RobotConnectionException e) {
                if (i == 2) {
                    throw new RobotConnectionException("З'єднання, нажаль, не відбулось!");
                }
            } finally {
                try {
                    robotConnection.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage() + " Проблеми з закриттям!");
                }
            }
        }
    }
}
