import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int codigoPeca1, numDePecas1, codigoPeca2, numDePecas2;
        double valorPeca1, valorPeca2, valorAPagar;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código da peça 1: ");
        codigoPeca1 = sc.nextInt();
        System.out.print("Digite o número de peças 1: ");
        numDePecas1 = sc.nextInt();
        System.out.print("Digite o valor da peça 1: ");
        valorPeca1 = sc.nextDouble();

        System.out.print("Digite o código da peça 2: ");
        codigoPeca2 = sc.nextInt();
        System.out.print("Digite o número de peças 2: ");
        numDePecas2 = sc.nextInt();
        System.out.print("Digite o valor da peça 2: ");
        valorPeca2 = sc.nextDouble();

        sc.close();

        valorAPagar = (valorPeca1 * numDePecas1) + (valorPeca2 * numDePecas2);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorAPagar);
    }
}