import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo, qtd;
        double preco = 0, valorFinal;

        System.out.println("Código: 1 / Cachorro Quente / Preço: R$ 4.00");
        System.out.println("Código: 2 / X-Salada / Preço: R$ 4.50");
        System.out.println("Código: 3 / X-Bacon / Preço: R$ 5.00");
        System.out.println("Código: 4 / Torrada simples / Preço: R$ 2.00");
        System.out.println("Código: 5 / Refrigerante / Preço: R$ 1.50");

        System.out.print("Digite o código do produto: ");
        codigo = sc.nextInt();
        System.out.print("Digite a quantidade do produto: ");
        qtd = sc.nextInt();

        if (codigo == 1) {
            preco = 4.00;
        } else if (codigo == 2) {
            preco = 4.50;
        } else if (codigo == 3) {
            preco = 5.00;
        } else if (codigo == 4) {
            preco = 2.00;
        } else if (codigo == 5) {
            preco = 1.50;
        } else {
            System.out.println("Código inválido!");
        }

        valorFinal = qtd * preco;

        System.out.printf("Total: R$ %.2f%n", valorFinal);

    }
}