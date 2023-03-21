import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int senha = 2002;
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a senha: ");
        int senhaInserida = sc.nextInt();

        while (senhaInserida != senha) {
            System.err.println("Senha inválida!");
            System.out.print("Insira a senha: ");
            senhaInserida = sc.nextInt();
        }

        System.out.println("Acesso permitido!");

        sc.close();
    }
}