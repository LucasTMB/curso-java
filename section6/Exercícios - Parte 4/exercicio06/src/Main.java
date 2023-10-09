import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int divisor;

        for (int i = n ; i > 0 ; i--) {
            if (n % i == 0) {
                divisor = n / i;

                System.out.println(divisor);
            }
        }

        sc.close();

    }
}