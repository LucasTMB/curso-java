package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered?: ");
        int quantity = sc.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i = 0 ; i < quantity ; i++) {
            System.out.println("\nEmployee #" + (i + 1) + ":");

            int id;
            while (true) {
                System.out.print("Id: ");
                id = sc.nextInt();

                if (hasId(employees, id)) {
                    System.out.println("The id already exists! Please enter another one.");
                } else {
                    break;
                }
            }

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee employee = new Employee(id, name, salary);
            employees.add(employee);
        }

        System.out.print("\nEnter the employee id that will have salary increase: ");
        int idIncrease = sc.nextInt();
        Employee emp = employees.stream().filter(x -> x.getId() == idIncrease).findFirst().orElse(null);

        if (emp != null) {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();

            emp.increaseSalary(percentage);
        } else {
            System.out.println("This id doesn't exist!");
        }

        System.out.println("\nList of employees: ");
        for (Employee employee : employees) {
            System.out.println(employee.getId() + ", " + employee.getName() + ", " + employee.getSalary());
        }

        sc.close();
    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        return emp != null;
    }
}
