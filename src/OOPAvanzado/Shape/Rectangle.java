package OOPAvanzado.Shape;

public class Rectangle extends Shape{

    protected double width;
    protected double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        double area = (width * length);
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = ((2*width) + (2*length));
        return perimeter;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Width of the Rectangle = ").append(width).append("\n")
                .append("Length of the Rectangle = ").append(length).append("\n")
                .append("Area of the Circle = ").append(getArea()).append("\n")
                .append("Perimeter of the Circle = ").append(getPerimeter()).append("\n");

        return sb.toString();
    }

}