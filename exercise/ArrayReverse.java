import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] numbers = {1,4,8,6,2,7,9};
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(getReversedArray(numbers)));
    }
    private static int[] getReversedArray(int[] numbers) {
        int i = 0, k = numbers.length - 1;
        while (i < k) {
            int temp = numbers[i];
            numbers[i] = numbers[k];
            numbers[k] = temp;
            i++;
            k--;
        }
        return numbers;
    }
}
