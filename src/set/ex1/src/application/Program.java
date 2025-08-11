package set.ex1.src.application;

import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] agrs) {

        Set<String> set = new HashSet<>();

        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");


        // Se o dado específico existe na lista, retorna TRUE ou FALSE
        System.out.println(set.contains("Notebook"));


        System.out.println("-------- ");
        for (String p : set) {
            System.out.println(p);
        }

        System.out.println("------- ");

        // Remover item especifico da lista
        set.remove("Tablett");

        for (String p : set) {
            System.out.println(p);
        }

        System.out.println("------ ");

        // Remove apenas itens que satisfizerem alguma condição
        set.removeIf(x -> x.length() >= 3);

        for (String p : set) {
            System.out.println(p);
        }

        System.out.println("------- ");

        set.add("Neymar");
        set.add("Pedro");
        set.add("Miguel");
        set.add("Thiago");
        set.add("Tom");

        set.removeIf(x -> x.charAt(0) == 'T');

        for (String p : set) {
            System.out.println(p);
        }

    }
}
