import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar?: ");
        int qtdNum = sc.nextInt();

        int[] vect = new int[qtdNum];

        for (int i = 0 ; i < qtdNum ; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        int numPares = 0;
        System.out.println("NÚMEROS PARES:");
        for (int x = 0 ; x < qtdNum ; x++) {
            if (vect[x] % 2 == 0) {
                System.out.print(vect[x] + " ");
                numPares += 1;
            }
        }

        System.out.printf("\nQUANTIDADE DE PARES = %d%n", numPares);

        sc.close();
    }
}