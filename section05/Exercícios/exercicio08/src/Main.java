import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double impostoDeRenda;

        System.out.print("Insira o valor do seu salário: ");
        double renda = sc.nextDouble();

        if (renda <= 2000.0) {
            impostoDeRenda = 0.0;
        }
        else if (renda <= 3000.0) {
            impostoDeRenda = (renda - 2000.0) * 0.08;
        }
        else if (renda <= 4500.0) {
            impostoDeRenda = (renda - 3000.0) * 0.18 + 1000.0 * 0.08;
        }
        else {
            impostoDeRenda = (renda - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (impostoDeRenda == 0.0) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f%n", impostoDeRenda);
        }
    }
}