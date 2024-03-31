package application;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas?: ");
        int qtdPessoas = sc.nextInt();
        Person[] vect = new Person[qtdPessoas];
        int qtdLessThan16 = 0;

        for (int i = 0 ; i < qtdPessoas ; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            sc.nextLine();

            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();

            if(age < 16) {
                qtdLessThan16 += 1;
            }

            vect[i] = new Person(name, age, height);
        }

        double sum = 0;

        for (int x = 0 ; x < qtdPessoas ; x++) {
            sum += vect[x].getHeight();
        }

        double avg = sum / qtdPessoas;
        double percentLessThan16 = (qtdLessThan16 * 100.0) / qtdPessoas;

        System.out.printf("\nAltura média: %.2f", avg);
        System.out.printf("\nPessoas com menos de 16 anos: %.1f", percentLessThan16);
        System.out.println("%");

        for (int z = 0 ; z < qtdPessoas ; z++) {
            if (vect[z].getAge() < 16) {
                System.out.println(vect[z].getName());
            }
        }

        sc.close();
    }
}
