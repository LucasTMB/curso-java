import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c, d, diferenca;

        System.out.print("Digite o valor de A: ");
        a = sc.nextInt();
        System.out.println("Valor de A: " + a);

        System.out.print("Digite o valor de B: ");
        b = sc.nextInt();
        System.out.println("Valor de B: " + b);

        System.out.print("Digite o valor de C: ");
        c = sc.nextInt();
        System.out.println("Valor de C: " + c);

        System.out.print("Digite o valor de D: ");
        d = sc.nextInt();
        System.out.println("Valor de D: " + d);

        sc.close();

        diferenca = (a * b) - (c * d);

        System.out.println("DIFERENÇA = " + diferenca);
    }
}