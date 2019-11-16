package OOPAvanzado.Empleados;

/* Nos piden hacer una un programa que gestione empleados.
Los empleados se definen por tener:
Nombre
Edad
Salario
También tendremos una constante llamada PLUS, que tendrá un valor de 300€
Tenemos dos tipos de empleados: repartidor y comercial.
El comercial, aparte de los atributos anteriores, tiene uno más llamado comisión (double).
El repartidor, aparte de los atributos de empleado, tiene otro llamado zona (String).
Crea sus constructores, getters and setters y toString (piensa como aprovechar la herencia).
No se podrán crear objetos del tipo Empleado (la clase padre) pero si de sus hijas.
Las clases tendrán un método llamado plus, que según en cada clase tendrá una
implementación distinta. Este plus básicamente aumenta el salario del empleado.
En comercial, si tiene más de 30 años y cobra una comisión de más de 200 euros, se le
aplicara el plus.
 En repartidor, si tiene menos de 25 y reparte en la “zona 3”, este recibirá el plus.
Puedes hacer que devuelva un booleano o que no devuelva nada, lo dejo a tu elección.
Crea una clase ejecutable donde crees distintos empleados y le apliques el plus para
comprobar que funciona.*/

public abstract class Employee {

    private static final int PLUS = 300;
    private static final int EMPLOYEEQTY = 3;

    protected String name;
    protected int age;
    protected double salary;

    /*Constructor for Employee abstract class, with name, age and salary attributes, which are Commercial and DeliveryMan will inherit. */

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    /* getter and setter for name*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /* getter and setter for age */

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    /* getter and setter for salary */

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /* getter for the const PLUS and getter for numbers of employees, which will then be used on a for loop inside Program */

    public int getPlus() {
        return PLUS;
    }

    public static int getEmployeeqty() {
        return EMPLOYEEQTY;
    }

    /*Checker and setter declaration, which will have their custom implementation on Commercial and DeliveryMan classes. */

    public abstract boolean isPlus();

    public abstract double setPlus();

    /* toString with a StringBuilder object, that commercial and deliveryman will inherit, but with their own implementations. */

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Name of the employee: ").append(name).append("\n")
                .append("Age of the employee: ").append(age).append("\n").
                append("Salary of the employee: ").append(salary).append("\n");
        return sb.toString();
    }
}
