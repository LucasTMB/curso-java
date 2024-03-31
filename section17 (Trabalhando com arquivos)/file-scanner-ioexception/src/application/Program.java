package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Lucas\\IdeaProjects\\in.txt"); // é necessário duas "\", pois "\" é prefixo de caracteres especiais em Java
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close(); // boa prática colocar o fechamento do Scanner no finally
            }
        }
    }
}
