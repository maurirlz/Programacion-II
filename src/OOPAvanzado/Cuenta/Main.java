package OOPAvanzado.Cuenta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Ingrese su nombre");
        Scanner sc = new Scanner(System.in);
        String titular = sc.nextLine();
        Cuenta cuenta1 = new Cuenta(titular);
        System.out.printf("Bienvenido, %s%n",titular);
        boolean bandera;
        do {
            System.out.printf("Porfavor, ingrese operacion a realizar: 1.Depositar%n2.Retirar%n");
            short opcion = sc.nextShort();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese cantidad a depositar: ");
                    double cantidad = sc.nextDouble();
                    cuenta1.Ingresar(cantidad);
                    System.out.printf("La cantidad ingresada fue %.2f%n, su saldo ahora es %.2f%n",cantidad,cuenta1.getCantidad());
                    break;
                case 2:
                    System.out.println("Ingrese cantidad a retirar: ");
                    double retirar = sc.nextDouble();
                    cuenta1.Retirar(retirar);
                    System.out.printf("Ha retirado %.2f pesos, su saldo ahora es %.2f%n",retirar, cuenta1.getCantidad());
                    break;
                default:
                    System.out.printf("Codigo de operacion incorrecto, por favor, ingrese un codigo de operacion nuevamente.%n");
            }
            System.out.printf("Desea volver al menu de operaciones o terminar el programa? %n0.Volver al menu de operaciones%n1.Terminar el programa%n");
            short banderacheck = sc.nextShort();
            if (banderacheck == 0){
                bandera = false;
            } else {
                bandera = true;
            }
        } while(!bandera);
        sc.close();
    }
}
