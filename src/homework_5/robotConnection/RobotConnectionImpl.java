package homework_5.robotConnection;

public class RobotConnectionImpl implements RobotConnection {
    @Override
    public void moveRobotTo(int x, int y) {
        System.out.println("Робот перемістився на позицію: " + x + " " + y);
    }

    @Override
    public void close() {
        System.out.println("З'єднання завершено.");
    }
}
