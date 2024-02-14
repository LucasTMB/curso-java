package application;

import entities.Employee;
import entities.OutsourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numEmployees = sc.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i = 1 ; i <= numEmployees ; i++) {
            System.out.println("\nEmployee #" + i + " data:");
            System.out.print("Outsourced (y/n)?: ");
            char yesOrNo = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if (yesOrNo == 'y') {
                System.out.print("Additional charge: ");
                double addCharge = sc.nextDouble();

                OutsourceEmployee emp = new OutsourceEmployee(name, hours, valuePerHour, addCharge);
                employees.add(emp);
            } else {
                Employee emp = new Employee(name, hours, valuePerHour);
                employees.add(emp);
            }
        }

        System.out.println("\nPAYMENTS:");
        for (Employee e : employees) {
            System.out.println(e.getName() + " - " + e.payment());
        }

        sc.close();
    }
}
