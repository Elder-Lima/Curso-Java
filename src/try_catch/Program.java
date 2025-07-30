package try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        method1();

        System.out.println("Fim do programa!");
    }
    public static void method1() {
        System.out.println("********Method1 Start *********");
        method2();
        System.out.println("********Method1 END *********");
    }
    public static void method2() {
        System.out.println("********Method2 Start *********");
        Scanner entrada = new Scanner(System.in);

        try {
            String[] vect = entrada.nextLine().split(" ");
            int position = entrada.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Position");
            // mostrar o erro: e.printStackTrace(); 
        }
        catch (InputMismatchException e) {
            System.out.println("Input Error");
        }
        entrada.close();
        System.out.println("********Method2 END *********");
    }
}
