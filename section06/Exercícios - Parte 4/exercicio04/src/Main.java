import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0 ; i < n ; i++) {
            float num1 = sc.nextFloat();
            float num2 = sc.nextFloat();
            float resultado = 0;

            if (num2 == 0) {
                System.out.println("Divisão impossível");
            } else {
                resultado = num1 / num2;
                System.out.println("Resultado: " + resultado);
            }
        }

        sc.close();

    }
}