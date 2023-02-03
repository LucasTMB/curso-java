import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi =  3.14159;
        double raio, area;

        System.out.print("Insira o valor do raio do círculo: ");
        raio = sc.nextDouble();
        System.out.println("Valor do raio: " + raio);

        area = pi * Math.pow(raio, 2.0);

        System.out.printf("A = %.4f%n", area);

    }
}