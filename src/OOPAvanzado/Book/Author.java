package OOPAvanzado.Book;

public class Author {

    private String authorname;
    private String email;
    private char gender;

    public Author(String authorname, String email, char gender) {
        this.authorname = authorname;
        this.email = email;
        this.gender = gender;
    }

    public String getAuthorName() {
        return authorname;
    }

    public void setAuthorName(String authorName) {
        this.authorname = authorName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String toString() {
        String ret = this.authorname + " (" + this.gender + ") at " + this.email;
        return ret;
    }
}