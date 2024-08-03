import java.util.Scanner;

public class ArrayCalculations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = input.nextInt();
        int[] numbers = new int[n];

        System.out.print("Enter elements : ");
        for (int i = 0;i < numbers.length;i++)
            numbers[i] = input.nextInt();

        System.out.println(sum(numbers));
        System.out.println(product(numbers));
        System.out.println(average(numbers));
    }
    private static double average(int[] numbers) {
       return (double) sum(numbers)/numbers.length;
    }
    private static int product(int[] numbers) {
        int product = 1;
        for (int i = 0;i < numbers.length;i++)
            product *= numbers[i];
        return product;
    }
    private static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0;i < numbers.length;i++)
            sum += numbers[i];
        return sum;
    }
}
