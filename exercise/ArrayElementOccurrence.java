import java.util.Scanner;

public class ArrayElementOccurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = input.nextInt();
        int[] numbers = new int[n];

        System.out.print("Enter elements : ");
        for (int i = 0;i < numbers.length;i++)
            numbers[i] = input.nextInt();

        System.out.print("Which element to check? : ");
        int a = input.nextInt();
        System.out.println(a + " occurs " + findOccurrence(numbers,a) + " times");
    }
    private static int findOccurrence(int[] numbers, int a) {
        int count = 0;
        for (int i = 0;i < numbers.length;i++) {
            if (a == numbers[i])
                count++;
        }
        return count;
    }
}
