package OOPAvanzado.PrimerParcial;

public abstract class Producto {

    protected static final int PRODUCTOS_MAX = 4;

    protected String nombre;
    protected double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double calcular(int cantidad){
        return this.precio*cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {

        final StringBuilder sb;
        sb = new StringBuilder();

        sb.append("Nombre del producto: ").append(this.nombre).append("\n");
        sb.append("Precio del producto: ").append(this.precio).append("\n");

        return sb.toString();
    }
}