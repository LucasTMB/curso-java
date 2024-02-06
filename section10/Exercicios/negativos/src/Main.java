import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int qtdNumeros = sc.nextInt();

        int vect[] = new int[qtdNumeros];

        for (int i = 0 ; i < qtdNumeros ; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS:");

        for (int x = 0 ; x < qtdNumeros ; x++) {
            if (vect[x] < 0) {
                System.out.println(vect[x]);
            }
        }

        sc.close();
    }
}