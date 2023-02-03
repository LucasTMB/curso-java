import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1, n2;
        int soma;

        System.out.print("Digite o primeiro valor: ");
        n1 = sc.nextInt();
        System.out.println("Primeiro valor: " + n1);

        System.out.print("Digite o segundo valor: ");
        n2 = sc.nextInt();
        System.out.println("Segundo valor: " + n2);

        sc.close();

        soma = n1 + n2;

        System.out.println("SOMA = " + soma);

    }
}