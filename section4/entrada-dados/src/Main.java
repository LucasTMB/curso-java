import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x;
        System.out.print("Digite algo: ");
        x = sc.next();
        System.out.println("Você digitou: " + x);

        int y;
        System.out.print("Digite um número: ");
        y = sc.nextInt();
        System.out.println("Você digitou: " + y);

        double z;
        System.out.print("Digite um número flutuante: ");
        z = sc.nextDouble();
        System.out.println("Você digitou: " + z);

        char c;
        System.out.print("Digite um caractere: ");
        c = sc.next().charAt(0);
        System.out.println("Você digitou: " + c);

        sc.close();

    }
}