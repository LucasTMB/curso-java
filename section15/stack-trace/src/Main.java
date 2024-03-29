import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        method1();

        System.out.println("Fim do programa");
    }

    public static void method1() {
        System.out.println("METHOD1 START");
        method2();
        System.out.println("METHOD1 END");
    }

    public static void method2() {
        System.out.println("METHOD2 START");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição inválida!");
            e.printStackTrace();
            sc.next();
        } catch (InputMismatchException e) {
            System.out.println("Input error");
        }

        System.out.println("METHOD2 END");

        sc.close();
    }
}