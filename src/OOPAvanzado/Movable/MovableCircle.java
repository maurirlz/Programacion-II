package OOPAvanzado.Movable;

public class MovableCircle implements Movable{

    private int radius;
    private MovablePoint center;

    public MovableCircle(int radius, MovablePoint center) {
        this.radius = radius;
        this.center = center;
    }

    @Override
    public void moveUp() {
        System.out.println("Moving up");
    }

    @Override
    public void moveDown() {
        System.out.println("Moving down");
    }

    @Override
    public void moveLeft() {
        System.out.println("Moving left");
    }

    @Override
    public void moveRight() {
        System.out.println("Moving right");
    }
}
