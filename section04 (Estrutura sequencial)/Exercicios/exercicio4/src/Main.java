import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int numero, horasTrabalhadas;
        double salarioPorHora, salario;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número do funcionário: ");
        numero = sc.nextInt();

        System.out.print("Digite o número de horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();

        System.out.print("Digite o salário que o funcionário ganha por hora: ");
        salarioPorHora = sc.nextDouble();

        sc.close();

        salario = (double) horasTrabalhadas * salarioPorHora;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f%n", salario);

    }
}