package ExerciciosLeet.vetores;

import java.util.ArrayList;
import java.util.Arrays;

public class exMeta {
    public static void main(String[] args) {

        int[] array = new int[]{1,7,3,6,5,6};

        for (int x=0; x<array.length; x++){
            int num = array[x];
            int rigthSum = 0;
            int leftSum = 0;

            int[] rightArray = Arrays.copyOfRange(array, x+1, array.length);
            int[] leftArray = Arrays.copyOfRange(array, 0, x);

            for(int y=0; y<rightArray.length; y++) {
                rigthSum += rightArray[y];
            }

            for(int y=0; y<leftArray.length; y++) {
                leftSum += leftArray[y];
            }

            if (rigthSum == leftSum) {
                System.out.println(x);
                break;
            }

        }


    }
}
