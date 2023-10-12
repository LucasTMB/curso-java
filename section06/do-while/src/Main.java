import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Insira um valor em celsius: ");
        Scanner sc = new Scanner(System.in);
        boolean condicao = false;
        float fahrenheit = 0;

        do {
            float celsius = sc.nextFloat();
            fahrenheit = ((celsius * 9) / 5) + 32;

            System.out.printf("Equivalente em Fahrenheit: %.2f ºF", fahrenheit);

            System.out.print("\nDeseja continuar? [1] Sim / [2] Não: ");
            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    condicao = false;
                    break;
                case 2:
                    condicao = true;
                    break;
            }
        } while (condicao != true);

        System.out.println("Fim do programa.");

        sc.close();

    }
}