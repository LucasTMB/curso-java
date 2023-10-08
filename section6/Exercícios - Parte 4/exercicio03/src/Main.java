import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0 ; i < n ; i++) {
            float num1 = sc.nextFloat();
            float num2 = sc.nextFloat();
            float num3 = sc.nextFloat();

            float media = ((num1 * 2) + (num2 * 3) + (num3 * 5)) / (2 + 3 + 5);

            System.out.println(media);
        }

        sc.close();

    }
}