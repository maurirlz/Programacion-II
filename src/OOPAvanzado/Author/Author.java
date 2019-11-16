package OOPAvanzado.Author;

public class Author {

    protected static final char GENDERM_DEF = 'm';
    private static final char GENDERF_DEF = 'f';
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email) {
        this(name,email,GENDERF_DEF);
    }

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author [name = " + name + ", email = " + email + ", gender = " + gender + "]";
    }
}