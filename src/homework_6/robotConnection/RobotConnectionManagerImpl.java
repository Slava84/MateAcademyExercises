package homework_6.robotConnection;

public class RobotConnectionManagerImpl implements RobotConnectionManager {
    @Override
    public RobotConnection getConnection() {
        System.out.println("Відбувається з'єднання.");
        return new RobotConnectionImpl();
    }
}
