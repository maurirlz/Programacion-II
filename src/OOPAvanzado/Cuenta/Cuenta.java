package OOPAvanzado.Cuenta;

public class Cuenta {

    protected final double CUENTA_DEF = 0;
    private String titular;
    private double cantidad;

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Cuenta(String titular) {
        this.titular = titular;
        this.cantidad = CUENTA_DEF;
    }
    public double Ingresar(double cantidad){
        if (cantidad < 0){
            return this.cantidad;
        }
        return this.cantidad+=cantidad;
    }
    public double Retirar(double cantidad){
        if (this.cantidad - cantidad < 0){
            setCantidad(0);
            return this.cantidad;
        }else{
            return this.cantidad-=cantidad;
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}
