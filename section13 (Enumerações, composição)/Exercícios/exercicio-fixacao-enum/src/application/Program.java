package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);

        sc.nextLine();
        System.out.println("\nEnter order data:");
        System.out.print("Status: ");
        String orderStatus = sc.nextLine();
        Order order = new Order(new Date(), OrderStatus.valueOf(orderStatus), client);

        System.out.print("How many items to this order?: ");
        int itemsQuantity = sc.nextInt();

        for (int i = 1 ; i <= itemsQuantity ; i++) {
            sc.nextLine();
            System.out.println("\nEnter #" + i + " item data:");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();

            Product p = new Product(productName, productPrice);
            OrderItem oi = new OrderItem(productQuantity, p.getPrice(), p);
            order.addItem(oi);
        }

        System.out.println("\nORDER SUMMARY:");
        System.out.println(order);

        sc.close();
    }
}
