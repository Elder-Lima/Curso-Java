package application;
import entities.Products;
import java.util.Locale;
import java.util.Scanner;

public class ProdutosVect {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();

        Products[] vect = new Products[n];

        for (int i=0; i< vect.length; i++) {
            entrada.nextLine();
            String name = entrada.nextLine();
            double price = entrada.nextDouble();
            vect[i] = new Products(name, price);
        }

        double sum = 0;
        for (int i=0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;
        System.out.println("Average Price: " + String.format("%.2f", avg));

    }
}
