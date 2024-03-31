import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor de i: ");
        int N = sc.nextInt();

        for (int i = N ; i >= 0 ; i--) {
            System.out.println("Valor de i: " + i);
        }

        sc.close();
    }
}