package OOPAvanzado.PrimerParcial;

public class Perecedero extends Producto {
    private int diasACaducar;

    public Perecedero(String nombre, double precio, int diasACaducar) {
        super(nombre, precio);
        this.diasACaducar = diasACaducar;
    }

    @Override
    public double calcular(int cantidad) {

        if (this.diasACaducar == 1){
            return ((this.precio * cantidad) / 4);
        }

        else if (this.diasACaducar == 2){
            return ((this.precio * cantidad) / 3);
        }

        else if (this.diasACaducar == 3){
            return ((this.precio * cantidad) / 2);
        }

        return (this.precio * cantidad);
    }

    public int getDiasACaducar() {
        return diasACaducar;
    }

    public void setDiasACaducar(int diasACaducar) {
        this.diasACaducar = diasACaducar;
    }

    @Override
    public String toString() {

        final StringBuilder sb;
        sb = new StringBuilder();

        sb.append(super.toString());
        sb.append("Dias hasta que caduque el producto: ").append(this.diasACaducar);

        return sb.toString();
    }
}