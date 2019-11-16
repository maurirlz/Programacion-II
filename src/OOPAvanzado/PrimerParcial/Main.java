package OOPAvanzado.PrimerParcial;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String nombreDelProducto, opt;
        double precio,precioTotal;
        int diasACaducar,cantidadProducto;
        char tipoNoPerecedero;

        ArrayList<Producto> productos = new ArrayList<>();
        productos.ensureCapacity(1);
        Scanner sc = new Scanner(System.in);
        precioTotal = 0;

        for (int i = 0; i < Producto.PRODUCTOS_MAX; i++) {

            System.out.printf("Ingrese el nombre del producto %d: ",i+1);
            nombreDelProducto = sc.next();
            System.out.printf("Ingrese el precio del producto %d: ",i+1);
            precio = sc.nextDouble();
            System.out.println("Es el producto no perecedero o perecedero?: (Ingrese PE para perecedero y NP para no perecedero) ");
            opt = sc.next();

            switch (opt.toUpperCase()) {
                case "NP":

                    System.out.println("Ingrese el tipo de alimento no perecedero (A.B.C.D)");
                    tipoNoPerecedero = sc.next().toUpperCase().charAt(0);
                    productos.add(new NoPerecedero(nombreDelProducto, precio, tipoNoPerecedero));
                    System.out.println("Ingrese la cantidad que se vendio del producto: ");
                    cantidadProducto = sc.nextInt();
                    precioTotal += productos.get(i).calcular(cantidadProducto);

                    break;
                case "PE":

                    System.out.println("Ingrese cuantos dias faltan para el vencimiento del producto: ");
                    diasACaducar = sc.nextInt();
                    productos.add(new Perecedero(nombreDelProducto,precio,diasACaducar));
                    System.out.println("Ingrese la cantidad que se vendio del producto: ");
                    cantidadProducto = sc.nextInt();
                    precioTotal += productos.get(i).calcular(cantidadProducto);

                    break;
                default:
                    System.out.println("Opcion ingresada no es valida.");
            }

        }
        sc.close();

        System.out.printf("El precio total a pagar es de: %.2f\n ",precioTotal);
        System.out.println("Detalles de los productos: \n");
        for (Producto producto : productos) {
            System.out.println(producto.toString());
        }
    }
}
