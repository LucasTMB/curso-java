package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Shape shape;
        List<Shape> shapes = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int numShapes = sc.nextInt();

        for (int i = 1 ; i <= numShapes ; i++) {
            System.out.println("Shape #" + i + " data: ");
            System.out.print("Rectangle or Circle (r/c)?: ");
            char recOrCir = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            String color = sc.next();

            if (recOrCir == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();

                shape = new Rectangle(Color.valueOf(color), width, height);
                shapes.add(shape);
            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                shape = new Circle(Color.valueOf(color), radius);
                shapes.add(shape);
            }
        }

        System.out.println("SHAPE AREAS: ");
        for (Shape s : shapes) {
            System.out.println(String.format("%.2f", s.area()));
        }

        sc.close();
    }
}
