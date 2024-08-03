import java.util.Arrays;
import java.util.Scanner;

public class ArrayMin {
    public static void main(String[] args) {
        int[] numbers = readIntegers();
        System.out.println(Arrays.toString(numbers));

        System.out.print("The Minimum number in Array : " + findMin(numbers));

    }
    private static int[] readIntegers(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Integers seperated by commas : ");
        String numbers = input.nextLine();
        String[] splitedArray = numbers.split(",");
        int[] numbersArray = new int[splitedArray.length];

        for (int i = 0; i < splitedArray.length;i++)
            numbersArray[i] = Integer.parseInt(splitedArray[i].trim());
        return numbersArray;
    }
    private static int findMin(int[] numbers){
        int min = numbers[0];
        for (int i = 0;i < numbers.length;i++)
            min = min > numbers[i] ? numbers[i] : min;
        return min;
    }
}
