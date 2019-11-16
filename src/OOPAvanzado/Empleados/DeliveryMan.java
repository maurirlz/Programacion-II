package OOPAvanzado.Empleados;

public class DeliveryMan extends Employee{

    private String zone;

    /*Constructor of DeliveryMan class, inheriting name, age and salary from Employee class. */

    public DeliveryMan(String name, int age, double salary, String zone) {
        super(name, age, salary);
        this.zone = zone;
    }

    /* Method inherited from Employee class. This method returns true or false depending if the target has a comission greater than 200 and his age is greater than 30.*/

    @Override
    public boolean isPlus() {

        return (this.zone.equalsIgnoreCase("zona 3") && this.age > 25);

    }
    /*Method inherited from Employee class. This method sets the object instance's salary depending if isPlus is true or false, basically giving a raise to the Employee.*/

    @Override
    public double setPlus() {
        if (isPlus()) {
            return salary+getPlus();
        }
        return salary;
    }

    /* Overriding  getters and setters inherited from Employee abstract class. */

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    @Override
    public void setSalary(double salary) {
        super.setSalary(salary);
    }

    /* Getter and setter for zone attribute. */

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    /*Overriding the inherited toString from employee and adding it's own "DeliveryMan" implementation, basically informing of the zone of work of the DeliveryMan.*/

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("Zone of action of the deliveryman: ").append(zone).append("\n");
        return sb.toString();
    }

}