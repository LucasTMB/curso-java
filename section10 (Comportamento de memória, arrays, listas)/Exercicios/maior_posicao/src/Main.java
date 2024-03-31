import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar?: ");
        int qtdNum = sc.nextInt();
        double[] vect = new double[qtdNum];
        double maiorValor = 0;
        int posicao = 0;

        for (int i = 0 ; i < qtdNum ; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();

            if (vect[i] > maiorValor) {
                maiorValor = vect[i];
                posicao = i;
            }
        }

        System.out.printf("\nMAIOR VALOR = %.1f", maiorValor);
        System.out.println("\nPOSIÇÃO DO MAIOR VALOR = " + posicao);

        sc.close();
    }
}