import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor?: ");
        int qtdNum = sc.nextInt();

        double[] vect = new double[qtdNum];

        for (int i = 0 ; i < qtdNum ; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        sc.close();

        double sum = 0;

        for (int i = 0 ; i < qtdNum ; i++) {
            sum += vect[i];
        }

        double media = sum / qtdNum;
        System.out.printf("\nMEDIA DO VETOR = %.3f", media);

        System.out.println("\nELEMENTOS ABAIXO DA MEDIA:");
        for (int i = 0 ; i < qtdNum ; i++) {
            if (vect[i] < media) {
                System.out.println(vect[i]);
            }
        }
    }
}