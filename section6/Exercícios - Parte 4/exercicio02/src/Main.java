import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int n_in = 0;
        int n_out = 0;

        for (int i = 0 ; i < n ; i++) {
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                n_in += 1;
            } else {
                n_out += 1;
            }
        }

        System.out.println(n_in + " in");
        System.out.println(n_out + " out");

        sc.close();

    }
}