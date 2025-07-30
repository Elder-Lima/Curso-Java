package metodos_abstratos.application;

import metodos_abstratos.entities.Circle;
import metodos_abstratos.entities.Rectangle;
import metodos_abstratos.entities.Shape;
import metodos_abstratos.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Shape> list = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Enter the number of shape: ");
        int n= entrada.nextInt();

        for(int x=1; x<=n; x++) {
            System.out.println("Shape #"+x+" data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char forma = entrada.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(entrada.next());

            switch (forma){
                case 'r': {
                    System.out.print("Width:" );
                    double width = entrada.nextDouble();

                    System.out.print("Height: ");
                    double height = entrada.nextDouble();
                    Shape rectangle = new Rectangle(color, width, height);
                    list.add(rectangle);
                    break;
                }
                case 'c': {
                    System.out.print("Radius: ");
                    double radius = entrada.nextDouble();
                    Shape circle = new Circle(color, radius);
                    list.add(circle);
                    break;
                }
            }
        }

        for (Shape s : list) {
            System.out.println(String.format("%.2f", s.area()));
        }

        entrada.close();
    }
}
