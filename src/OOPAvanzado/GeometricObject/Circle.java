package OOPAvanzado.GeometricObject;

public class Circle implements GeometricObject{

    protected static final double RADIUS_DEF = 1.0;

    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this.radius = RADIUS_DEF;
    }

    @Override
    public double getPerimeter() {
        return (Math.PI * (radius * 2));
    }

    @Override
    public double getArea() {
        return ((Math.pow(radius, 2) * Math.PI));
    }

}
