package application;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas?: ");
        int qtd = sc.nextInt();

        Person[] people = new Person[qtd];
        double highestHeight = 0;
        double sumFHeight = 0;
        int qtdF = 0;
        int qtdM = 0;

        for (int i = 0 ; i < qtd ; i++) {
            System.out.print("Altura da " + (i + 1) + "a pessoa: ");
            double height = sc.nextDouble();
            System.out.print("Gênero da " + (i + 1) + "a pessoa: ");
            char gender = sc.next().charAt(0);

            people[i] = new Person(height, gender);

            if (people[i].getHeight() > highestHeight) {
                highestHeight = people[i].getHeight();
            }

            if (people[i].getGender() == 'F') {
                sumFHeight += people[i].getHeight();
                qtdF += 1;
            } else {
                qtdM += 1;
            }
        }

        double lowestHeight = highestHeight;
        for (int i = 0 ; i < qtd ; i++) {
            if (people[i].getHeight() < lowestHeight) {
                lowestHeight = people[i].getHeight();
            }
        }

        double avgFHeight = sumFHeight / qtdF;

        System.out.printf("\nMenor altura = %.2f", lowestHeight);
        System.out.printf("\nMaior altura = %.2f", highestHeight);
        System.out.printf("\nMédia das alturas das mulheres = %.2f", avgFHeight);
        System.out.println("\nNúmero de homens = " + qtdM);

        sc.close();
    }
}
