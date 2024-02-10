package application;

import entities.ProductWrapper;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        ProductWrapper p1 = new ProductWrapper("Martelo", 45.90, 50);

        System.out.println(p1.name);
        System.out.println(p1.price);
        System.out.println(p1.quantity);

        ProductWrapper p2 = new ProductWrapper("Escada", 50.00, null);

        System.out.println(p2.name);
        System.out.println(p2.price);
        System.out.println(p2.quantity); // ele também aceita nulo
    }
}
