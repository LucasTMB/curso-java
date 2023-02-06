import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2, resto;

        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = sc.nextInt();
        sc.close();

        if (num2 > num1)
            resto = num2 % num1;
        else
            resto = num1 % num2;

        if (resto == 0) {
            System.out.println("São Multíplos");
        } else {
            System.out.println("Não são Multíplos");
        }
    }
}