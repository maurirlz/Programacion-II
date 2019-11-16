package OOPAvanzado.Student;

public final class Student extends Person{

    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Name: ").append(getName()).append("\n").append("Address: ").append(getAddress()).
                append("\n").append("Studies in: ").append(program).append(" In year: ").append(year).append("\n").append("His total fee is: ").append(fee);
        return sb2.toString();
    }
}
