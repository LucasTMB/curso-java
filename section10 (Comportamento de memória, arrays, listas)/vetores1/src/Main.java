import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Determine quantas alturas você deseja inserir: ");
        int qtdAlturas = sc.nextInt();
        double[] vect = new double[qtdAlturas];

        for (int i = 0 ; i < qtdAlturas ; i++) {
            vect[i] = sc.nextDouble();
        }

        double sum = 0;
        for (int x = 0 ; x < qtdAlturas ; x++) {
            sum += vect[x];
        }

        double avg = sum / qtdAlturas;

        System.out.printf("AVERAGE RATE: %.2f", avg);

        sc.close();
    }
}