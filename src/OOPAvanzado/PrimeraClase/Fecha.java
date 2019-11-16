package OOPAvanzado.PrimeraClase;

public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    protected String ArregloDeMeses[] =
            {" ","Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio",
                    "Agosto","Septiembre","Octubre","Noviembre","Diciembre"};

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public void modificarFecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public void mostrarFecha(int dia, int mes, int anio){
        System.out.println("Dia: " + this.dia + "Mes: "+ this.mes + "Anio: "+ this.anio);
    }

    public void mostrarFechaConMes(int dia, int mes, int anio){
        System.out.println("Dia: "+ this.dia + "Mes: "+ this.ArregloDeMeses[this.mes] + "Anio: "+ this.anio);
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
