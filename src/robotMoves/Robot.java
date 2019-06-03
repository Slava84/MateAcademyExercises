package robotMoves;

public class Robot {
    private Direction direction = Direction.UP;
    private int x = 0;
    private int y = 0;

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        switch (direction){
            case UP: direction = Direction.LEFT;
                     break;
            case LEFT: direction = Direction.DOWN;
                       break;
            case DOWN: direction = Direction.RIGHT;
                       break;
            case RIGHT: direction = Direction.UP;
        }
    }

    public void turnRight() {
        switch (direction){
            case UP: direction = Direction.RIGHT;
                break;
            case RIGHT: direction = Direction.DOWN;
                break;
            case DOWN: direction = Direction.LEFT;
                break;
            case LEFT: direction = Direction.UP;
        }

    }

    public void stepForward() throws Exception {
        switch (direction){
            case UP: ++y;
                 break;
            case DOWN: if (y != 0) --y;
                       else throw new Exception("Значення осі \"Y\" не може бути від'ємним!");
                 break;
            case RIGHT: ++x;
                 break;
            case LEFT: if (x != 0) --x;
                       else throw  new Exception("Значення осі \"X\" не може бути від'ємним!");
        }
    }
}
