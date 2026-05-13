
import java.util.Scanner;


class BankAccount {
    int accNo;
    String name;
    double balance;

    void createAccount(int a, String n, double b) {
        accNo = a;
        name = n;
        balance = b;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void display() {
        System.out.println("\nAccount No: " + accNo);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class bankacc_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount b1 = new BankAccount(); // object creation

        System.out.print("Enter Account No: ");
        int acc = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Balance: ");
        double bal = sc.nextDouble();

        // object calling
        b1.createAccount(acc, name, bal);

        System.out.print("Enter deposit amount: ");
        double dep = sc.nextDouble();
        b1.deposit(dep);

        System.out.print("Enter withdraw amount: ");
        double wit = sc.nextDouble();
        b1.withdraw(wit);

        b1.display();
    }
}