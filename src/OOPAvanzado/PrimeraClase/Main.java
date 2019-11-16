package OOPAvanzado.PrimeraClase;

import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el valor numero del dia.");
        int dia = lector.nextInt();

        System.out.println("Ingrese el valor numero del mes.");
        int mes = lector.nextInt();

        System.out.println("Ingrese el valor del anio.");
        int anio = lector.nextInt();

        lector.close();

        Fecha fecha1 = new Fecha(dia, mes, anio);
        fecha1.mostrarFecha(dia,mes,anio);

        System.out.println("Mostrando mes con su palabra: ");
        fecha1.mostrarFechaConMes(dia, mes, anio);
    }
}
