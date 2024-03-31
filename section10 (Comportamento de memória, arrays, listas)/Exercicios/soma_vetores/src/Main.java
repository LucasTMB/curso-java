import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor?: ");
        int qtdValores = sc.nextInt();

        int[] vectA = new int[qtdValores];
        int[] vectB = new int[qtdValores];

        System.out.println("Digite os valores do vetor A: ");

        for (int i = 0 ; i < qtdValores ; i++) {
            vectA[i] = sc.nextInt();
        }

        int[] vectC = new int[qtdValores];

        System.out.println("Digite os valores do vetor B: ");

        for (int i = 0 ; i < qtdValores ; i++) {
            vectB[i] = sc.nextInt();

            vectC[i] = vectA[i] + vectB[i];
        }

        sc.close();

        System.out.println("VETOR RESULTANTE: ");

        for (int i = 0 ; i < qtdValores ; i++) {
            System.out.println(vectC[i]);
        }

    }
}