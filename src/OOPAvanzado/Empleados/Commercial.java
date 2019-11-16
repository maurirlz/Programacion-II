package OOPAvanzado.Empleados;

public class Commercial extends Employee {

    private double comission;

    /*Constructor for Commercial*/

    public Commercial(String name, int age, double salary, double comission) {
        super(name, age, salary);
        this.comission = comission;
    }

	/* Method inherited from Employee class. This method returns true or false depending if
	 the target has a comission greater than 200 and his age is greater than 30.*/

    @Override
    public boolean isPlus() {
        return this.comission > 200 && this.age > 30;
    }

	/* This method sets the object instance's salary depending if isPlus is true or false, basically giving
	 a raise to the Employee. */

    @Override
    public double setPlus() {
        if (isPlus()) {
            return this.salary + getPlus();
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

    /* Getter and setter for Comission attribute. */

    public double getComission() {
        return comission;
    }

    public void setComission(double comission) {
        this.comission = comission;
    }

	/*Overriding the inherited toString from employee and adding it's own "Commercial" implementation, basically
	informing of the Salary of the Commercial.*/

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("Salary of the employee: ").append(salary).append("\n");
        return sb.toString();
    }
}
