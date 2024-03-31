package application;

import entities.Estudante;
import entities.Quarto;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Quarto[] quartos = new Quarto[10];

        for (int i = 0 ; i < quartos.length ; i++) {
            quartos[i] = new Quarto(i);
        }

        int qtdQuartosParaAlugar;

        while (true) {
            System.out.print("Quantos quartos vão ser alugados?: ");
            qtdQuartosParaAlugar = sc.nextInt();

            if (qtdQuartosParaAlugar > 10 || qtdQuartosParaAlugar <= 0) {
                System.out.println("\nQuantidade escolhida é incompatível com nossa capacidade atual. Por favor, escolha um número entre 1 e 10.");
            } else {
                break;
            }
        }

        Estudante[] estudantes = new Estudante[qtdQuartosParaAlugar];
        String nome;
        String email;
        int numero;

        for (int i = 0 ; i < qtdQuartosParaAlugar ; i++) {
            sc.nextLine();
            System.out.println("\nAluguel #" + (i + 1) + ": ");
            System.out.print("Nome: ");
            nome = sc.nextLine();
            System.out.print("Email: ");
            email = sc.nextLine();
            while (true) {
                System.out.print("Quarto: ");
                numero = sc.nextInt();

                if (quartos[numero].getEstudante() == null) {
                    break;
                } else {
                    System.out.println("O quarto já está ocupado! Por favor, insira outro número.");
                }
            }

            estudantes[i] = new Estudante(nome, email);
            quartos[numero].setEstudante(estudantes[i]);
        }

        System.out.println("\nQuartos ocupados:");
        for (int i = 0 ; i < quartos.length ; i++) {
            if(quartos[i].getEstudante() != null) {
                System.out.println(quartos[i].toString());
            }
        }

        sc.close();
    }
}
