package OOPAvanzado.GeometricObject;

public class ResizeableCircle extends Circle implements Resizeable{

    public ResizeableCircle(double radius) {
        super(radius);
    }

    @Override
    public int resize(int percent) {
        return 0;
    }
}
