import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        int idade = 19;
        String name = "Lucas";
        double altura = 1.70;
        double pi = 3.141592653;

        System.out.print("Bom dia! ");
        System.out.println("Meu nome é " + name + " e tenho " + idade + " anos");
        System.out.printf("%.2f%n", pi); // para quebrar a linha no final, se usa "/n" ou "%n"
        System.out.printf("%.4f%n", pi);

        Locale.setDefault(Locale.US); // coloca a linguagem padrão como en-us
        System.out.printf("%.4f%n", pi); // agora o separador é um ponto
        System.out.printf("O valor de PI é igual a %.2f %n", pi); // concatenando com o printf
        System.out.printf("%s tem %d anos e tem %.2f de altura", name, idade, altura);

    }
}