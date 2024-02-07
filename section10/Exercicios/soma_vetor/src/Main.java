import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar?: ");
        int qtdNum = sc.nextInt();

        double[] vect = new double[qtdNum];

        for (int x = 0 ; x < qtdNum ; x++) {
            System.out.print("Digite um número: ");
            vect[x] = sc.nextDouble();
        }

        double sum = 0;

        System.out.print("VALORES = ");
        for (int i = 0 ; i < qtdNum ; i++) {
            System.out.printf("%.1f ", vect[i]);

            sum += vect[i];
        }

        double avg = sum / qtdNum;

        System.out.printf("\nSOMA = %.2f", sum);
        System.out.printf("\nMÉDIA = %.2f", avg);

        sc.close();
    }
}