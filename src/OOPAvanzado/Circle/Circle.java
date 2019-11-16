package OOPAvanzado.Circle;

public class Circle {

    protected static final double RADIUS_DEF = 1.0;
    private double radius;

    public Circle() {
        this.radius = RADIUS_DEF;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return (Math.PI * Math.pow(radius,2));
    }

    public double getCircumference() {
        return (Math.PI * (radius * 2));
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", Area of the Circle = " + getArea() + ", Circle's circumference = " + getCircumference()
                + "]";
    }

}
