import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // lembrando que List é uma interface, não classe
        // Outro detalhe, é que é necessário usar Wrapper classes ao invés de tipos primitivos na declaração do tipo da lista
        List<String> list = new ArrayList<>();

        // adicionando elementos na lista
        list.add("Lucas");
        list.add("João");
        list.add("Maria");
        list.add("Marcio");
        list.add("Luana");

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-------------");

        list.add(1, "Fábio");

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-------------");

        // verificando tamanho da lista
        System.out.println(list.size());

        System.out.println("-------------");

        // removendo item da lista
        list.remove("João");

        // também posso eliminar por posição
        // Ex: list.remove(1)

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-------------");
        // removendo por predicado
        list.removeIf(x -> x.charAt(0) == 'M'); // removendo todos que começam com a letra M

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-------------");
        // encontrando por indice
        System.out.println("Index of Lucas: " + list.indexOf("Lucas"));
        // quando não encontra, retorna -1
        System.out.println("Index of Renato: " + list.indexOf("Renato"));

        System.out.println("-------------");
        // filtrando todos que começam com L
        // List<String> result = list.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toList());
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'L').toList(); // a partir do Java 16

        for(String x : result) {
            System.out.println(x);
        }

        System.out.println("-------------");
        // Primeiro elemento que começa com A
        String name = list.stream().filter(x -> x.charAt(0) == 'L').findFirst().orElse(null); // se não existir, retorna null

        System.out.println("Primeiro elemento que começa com L: " + name);
    }
}