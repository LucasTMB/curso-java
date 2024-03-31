import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor?: ");
        int qtdNum = sc.nextInt();

        int[] vect = new int[qtdNum];
        int sum = 0;
        int qtdPares = 0;

        for (int i = 0 ; i < qtdNum ; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();

            if (vect[i] % 2 == 0) {
                sum += vect[i];
                qtdPares += 1;
            }
        }

        sc.close();

        if (qtdPares > 0) {
            double avg = sum / qtdPares;
            System.out.printf("\nMEDIA DOS PARES = %.1f", avg);
        } else {
            System.out.println("\nNENHUM NÚMERO PAR");
        }
    }
}