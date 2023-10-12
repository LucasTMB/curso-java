import java.util.Locale;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um valor entre os intervalos ((0,25], (25,50], (50,75], (75,100]): ");
        double intervalo = sc.nextDouble();

        if (intervalo >= 0 && intervalo <= 25) {
            System.out.printf("Intervalo (0,25]");
        } else if (intervalo >= 25 && intervalo <= 50) {
            System.out.printf("Intervalo (25,50]");
        } else if (intervalo >= 50 && intervalo <= 75) {
            System.out.printf("Intervalo (50,75]");
        } else if (intervalo >= 75 && intervalo <= 100) {
            System.out.printf("Intervalo (75,100]");
        } else {
            System.out.printf("Fora de intervalo");
        }
    }
}