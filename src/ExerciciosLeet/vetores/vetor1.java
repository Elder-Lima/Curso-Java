package ExerciciosLeet.vetores;

public class vetor1 {
    public static void main(String[] args) {
        int target = 9;
        int[] array = new int[]{11, 15, 2, 7};

        for (int x=0; x<array.length; x++) {
            for (int y=0; y<array.length; y++) {
                if (array[x] + array[y] == target) {
                    System.out.println(x + ", " + y);
                    return;
                }
            }
        }
    }
}
