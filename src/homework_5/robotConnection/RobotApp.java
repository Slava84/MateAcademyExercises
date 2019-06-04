package homework_5.robotConnection;

public class RobotApp {
    static RobotConnection robotConnection;

    public static void main(String[] args) {
        try {
            moveRobot(new RobotConnectionManagerImpl(), 5, 8);
        } catch (RobotConnectionException e) {
            e.getMessage();
        }
    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        for (int i = 0; i < 3; i++) {
            try {
                robotConnection = robotConnectionManager.getConnection();
                robotConnection.moveRobotTo(toX, toY);
                break;
            } catch (RobotConnectionException e) {
                if (i == 2) {
                    throw new RobotConnectionException("З'єднання, нажаль, не відбулось!");
                }
            } catch (Exception e) {
                break;
            } finally {
                robotConnection.close();
            }
        }
    }
}
