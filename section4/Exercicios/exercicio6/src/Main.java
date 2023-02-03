import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double pi = 3.14159265359;
        double A, B, C;
        double areaTrianguloRetangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor de A: ");
        A = sc.nextDouble();
        System.out.print("Insira o valor de B: ");
        B = sc.nextDouble();
        System.out.print("Insira o valor de C: ");
        C = sc.nextDouble();

        areaTrianguloRetangulo = (A * C) / 2;
        areaCirculo = pi * Math.pow(C, 2.0);
        areaTrapezio = ((A + B) * C) / 2;
        areaQuadrado = Math.pow(B, 2.0);
        areaRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", areaTrianguloRetangulo);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n", areaRetangulo);

        sc.close();



    }
}