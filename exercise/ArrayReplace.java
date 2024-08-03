import java.util.Arrays;
public class ArrayReplace {
    public static void main(String[] args) {
        int[] numbers = {1,-2,3,4,8,5,9,7};
        int[] newNumbers = new int[numbers.length];
        int j = 0;
        int k = numbers.length - 1;
        for (int i = 0;i < numbers.length;i++){
            if (numbers[i] % 2 != 0)
                newNumbers[j++] = numbers[i];
            else
                newNumbers[k--] = numbers[i];
        }
        copyArray(newNumbers,numbers); 
        System.out.println(Arrays.toString(numbers));
    }
    private static void copyArray(int[] newNumbers, int[] numbers) {
        for (int i = 0;i < newNumbers.length;i++)
            numbers[i] = newNumbers[i];
    }
}
