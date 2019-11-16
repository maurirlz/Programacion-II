package OOPAvanzado.Student;

public final class Staff extends Person {

    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        final StringBuilder sb1 = new StringBuilder();
        sb1.append("Name: ").append(getName()).append("\n").append("Address: ").append(getAddress()).
                append("\n").append("Works in: ").append(school).append("\n").append("Earning: ").append(pay).append("\n");
        return sb1.toString();
    }
}
