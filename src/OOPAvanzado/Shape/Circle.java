package OOPAvanzado.Shape;

public class Circle extends Shape {

    protected double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = Math.PI * (Math.pow(radius, 2));
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = ((2*radius) * Math.PI);
        return perimeter;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Radius of the Circle = ").append(radius).append("\n")
                .append("Area of the Circle = ").append(getArea()).append("\n")
                .append("Perimeter of the Circle = ").append(getPerimeter()).append("\n");
        return sb.toString();
    }

}
