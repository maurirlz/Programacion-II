package OOPAvanzado.PrimerParcial;

public class NoPerecedero extends Producto{

    private char tipo;

    public NoPerecedero(String nombre, double precio,char tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    @Override
    public double calcular(int cantidad) {
        return super.calcular(cantidad);
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        final StringBuilder sb;
        sb = new StringBuilder();

        sb.append(super.toString());
        sb.append("Tipo del producto: ").append(this.tipo);

        return sb.toString();
    }
}
