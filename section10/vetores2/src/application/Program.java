package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String name;
        double price;

        System.out.print("Insira a quantidade de produtos: ");
        int qtdProdutos = sc.nextInt();

        Product[] vect = new Product[qtdProdutos];

        for (int i = 0 ; i < qtdProdutos ; i++) {
            // consome a quebra de linha pendente
            sc.nextLine();

            System.out.print("Insira o nome do produto: ");
            name = sc.nextLine();
            System.out.print("Insira o preço do produto: ");
            price = sc.nextDouble();

            vect[i] = new Product(name, price);
        }

        double sum = 0;
        for (int x = 0 ; x < qtdProdutos ; x++) {
            sum += vect[x].getPrice();
        }

        double avg = sum / qtdProdutos;

        System.out.printf("AVARAGE PRICE = %.2f", avg);

        sc.close();
    }
}
