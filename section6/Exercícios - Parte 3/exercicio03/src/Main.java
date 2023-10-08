import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtdAlcool = 0;
        int qtdGasolina = 0;
        int qtdDiesel = 0;

        int opcaoMenu;
        boolean menu = false;

        while (menu != true) {
            System.out.println("\nQual tipo de combustível você deseja abastecer?\n");
            System.out.println("1 - Álcool");
            System.out.println("2 - Gasolina");
            System.out.println("3 - Diesel");
            System.out.println("4 - Fim");

            opcaoMenu = sc.nextInt();

            switch (opcaoMenu) {
                case 1:
                    qtdAlcool++;
                    break;
                case 2:
                    qtdGasolina++;
                    break;
                case 3:
                    qtdDiesel++;
                    break;
                case 4:
                    System.out.println("\nMUITO OBRIGADO!");
                    System.out.println("Alcool: " + qtdAlcool);
                    System.out.println("Gasolina: " + qtdGasolina);
                    System.out.println("Diesel: " + qtdDiesel);
                    menu = true;
                    break;
                default:
                    break;
            }
        }

        sc.close();
    }
}