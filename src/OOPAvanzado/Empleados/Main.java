package OOPAvanzado.Empleados;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Defining variables for Name, zone, option, age, salary and comission, needed in order to load  data into the next arraylist and instances that will be created. */

        String name,zone,opt;
        Integer age;
        Double salary,comission;

        /* Arraylist that will hold instances of DeliveryMan or Commercial, that are child-classes of Employee */

        ArrayList<Employee> al = new ArrayList<>();

        /* Scanner used to read data from console/userinput */

        Scanner sc = new Scanner(System.in);

        /* For used to load the arraylist with instances of DeliveryMan or Commercial, with a length a length of getEmployeeqty();  */

        for (int i = 0; i < Employee.getEmployeeqty(); i++) {

            /*Getting name, age, salary and options. */

            System.out.println("Ingrese el nombre del empleado:  ");
            name = sc.next();
            System.out.println("Ingrese la edad del empleado: ");
            age = sc.nextInt();
            System.out.println("Ingrese el salario del empleado: ");
            salary = sc.nextDouble();
            System.out.println("Es el empleado un Repartidor o un Comercial?");
            opt = sc.next();

            /* Scanner no longer used, so we invoke close() method from Scanner class, which stops reserving memory for the instance of Scanner called sc. */

            sc.close();

            /* Depending if the user inputs repartidor or commercial, there will be a instance of that choice created and stored on the ArrayList, it's also converted to lower case so it doesn't need to compare multiple lower and upper casses. */

            switch (opt.toLowerCase()) {
                case "repartidor":
                    System.out.println("Ingrese la zona del repartidor: (ej: zona 3)");
                    zone = sc.next().toLowerCase();
                    al.add(new DeliveryMan(name, age, salary, zone));
                    break;
                case "comercial":
                    System.out.println("Ingrese la cantidad de la comision del comercial: ");
                    comission = sc.nextDouble();
                    al.add(new Commercial(name, age, salary, comission));
                    break;

                /* If there is no option with a String of "comercial or repartidor" in it, then default pops, informing that the data created wasn't loaded into the arraylist.  */

                default: System.out.println("Opcion ingresada no es valida, por favor, indique si es un repartidor o un comercial.");
            }
        }

        System.out.println("Ingrese el nombre del empleado a acreditar el plus.");
        String comparition = sc.nextLine();

    }
}
