import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de vezes que o valor será somado: ");
        int N = sc.nextInt();

        int soma = 0;
        for (int i = 0 ; i < N ; i++) {
            int x = sc.nextInt();
            soma = soma + x;
        }

        System.out.print("Valor final: ");
        System.out.println(soma);

        sc.close();
    }
}