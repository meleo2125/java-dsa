import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class ArraySort {
    public static void main(String[] args) {
        int[] myArray = getRandomArray(5);
        System.out.println(Arrays.toString(myArray));

        Arrays.sort(myArray);
        int[] reversedArray = getReversedSortedArray(myArray);
        System.out.println(Arrays.toString(reversedArray));
    }
    private static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newArray = new int[len];
        for (int i = 0;i < len;i++){
            newArray[i] = random.nextInt(100);
        }
        return newArray;
    }
    private static int[] getReversedSortedArray(int[] myArray){
        int[] secondArray = new int[myArray.length];
        for (int i = 0, k = myArray.length - 1;i < secondArray.length;i++,k-- ){
            secondArray[i] = myArray[k];
        }
        return secondArray;
    }
}
