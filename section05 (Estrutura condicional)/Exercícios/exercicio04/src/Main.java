import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int horaInicial = 0, horaFinal = 0, duracao = 0;
        boolean condicao = false;

        while (condicao != true) {
            System.out.print("Digite a hora que iniciou o jogo: ");
            horaInicial = sc.nextInt();
            System.out.print("Digite a hora que terminou o jogo: ");
            horaFinal = sc.nextInt();

            if ((horaInicial > 24 || horaInicial < 0) || (horaFinal > 24 || horaFinal < 0)) {
                System.out.println("Hora inválida! Digite novamente!");
                condicao = false;
            } else {
                sc.close();
                condicao = true;
            }
        }

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S");
    }
}