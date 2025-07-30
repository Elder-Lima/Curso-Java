package ExerciciosLeet.vetores;

public class exMeta2 {
    public static void main(String[] args) {
        int[] array = {1, 7, 3, 6, 5, 6, 5, 5, 5, 5, 6, 7};
        int total = 0;

        for (int num : array) {
            total += num;
        }

        int leftSum = 0;

        for (int i = 0; i < array.length; i++) {
            int rightSum = total - leftSum - array[i];

            if (leftSum == rightSum) {
                System.out.println("Índice de equilíbrio: " + i + ", valor: " + array[i]);
                return;
            }

            leftSum += array[i];
        }

        System.out.println("Nenhum índice de equilíbrio encontrado.");
    }
}
