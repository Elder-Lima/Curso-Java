package ExerciciosLeet.vetores;
import java.util.HashMap;

public class vetor3 {
    public static void main(String[] args) {
        int[] array = new int []{11, 15, 2, 7};
        HashMap<Integer, Integer> hasher = new HashMap<>();
        int target = 9;
        for (int x=0; x<array.length; x++) {
            int valor = array[x];
            int cal = target - valor;
            if (hasher.containsKey(valor)) {
                int indiceHasher = hasher.get(valor);
                System.out.println(array[indiceHasher] + " + " + valor + " = " + target);
                return;
            }
            hasher.put(cal, x);
        }
    }
}