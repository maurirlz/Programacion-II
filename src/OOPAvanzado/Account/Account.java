package OOPAvanzado.Account;

public class Account {

    protected static final int BALANCE_DEF = 0;
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name) {
        this(id,name,BALANCE_DEF);
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int credit(int amount) {
        this.balance+=amount;
        return this.balance;
    }

    public int debit(int amount) {
        if (amount <= this.balance) {

            this.balance-=amount;
            return this.balance;
        } else {

            System.out.println("Amount exceeded balance");
        }

        return this.balance;
    }
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
}