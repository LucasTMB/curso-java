package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account a;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine(); // Consumir a quebra de linha
        String name = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)?: ");
        char response = sc.next().charAt(0);

        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            a = new Account(number, name, initialDeposit);
        } else {
            a = new Account(number, name);
        }

        System.out.println();
        System.out.println("Account data:\n" + a);
        System.out.println();

        System.out.print("Enter a deposite value: ");
        double depositValue = sc.nextDouble();
        a.deposit(depositValue);
        System.out.println("Updated account data:\n" + a);
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        a.withdraw(withdrawValue);
        System.out.println("Updated account data:\n" + a);
        System.out.println();

        sc.close();
    }
}
