package application;

import entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados: ");
        int qtd = sc.nextInt();

        Aluno[] alunos = new Aluno[qtd];

        for (int i = 0 ; i < qtd ; i++) {
            sc.nextLine();
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
            String name = sc.nextLine();
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();

            alunos[i] = new Aluno(name, n1, n2);
        }

        System.out.println("Alunos aprovados: ");
        for (int i = 0 ; i < qtd ; i++) {
            if (alunos[i].getAvg() >= 6) {
                System.out.println(alunos[i].getName());
            }
        }

        sc.close();
    }
}
