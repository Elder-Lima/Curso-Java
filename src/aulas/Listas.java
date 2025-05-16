package aulas;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Anna");
        list.add("ANDERSON");
        list.add("Bob");
        list.add("Marco");
        list.add(2, "Neymar");

        for(String v : list) {
            System.out.println(v);
        }

        System.out.println("------------");

        list.removeIf(x -> x.charAt(0) == 'M');
        for(String v : list) {
            System.out.println(v);
        }

        System.out.println("------------");

        System.out.println("Index of Bob: " + list.indexOf("Bob"));

        System.out.println("------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for(String v : result) {
            System.out.println(v);
        }

        System.out.println("--------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'Z').findFirst().orElse(null);
        System.out.println(name);

    }
}
