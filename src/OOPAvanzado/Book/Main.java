package OOPAvanzado.Book;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name;
        String email;
        String authorName;
        int price;
        int qty;
        char gender;

        Author[] author = new Author[2];

        for (int i = 0; i < author.length; i++) {
            System.out.println("Author's name: ");
            authorName = sc.nextLine();
            System.out.println("Author's email: ");
            email = sc.nextLine();
            System.out.println("Author's gender: ");
            gender = sc.next().charAt(0);
            author[i] = new Author(authorName, email, gender);
            sc.nextLine();
        }
        System.out.println("Book's title: ");
        name = sc.nextLine();
        System.out.println("Book's price: ");
        price = sc.nextInt();
        System.out.println("How much copies of the book have been sold?: ");
        qty = sc.nextInt();

        sc.close();
    }
}