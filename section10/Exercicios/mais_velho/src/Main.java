import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar?: ");
        int qtd = sc.nextInt();

        String[] nome = new String[qtd];
        int[] idade = new int[qtd];
        int maiorIdade = 0;
        int posicaoMaiorIdade = 0;
        
        for (int i = 0 ; i < qtd ; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            sc.nextLine();
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();

            if (idade[i] > maiorIdade) {
                maiorIdade = idade[i];
                posicaoMaiorIdade = i;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + nome[posicaoMaiorIdade]);

        sc.close();
    }
}