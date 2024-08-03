import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a four-digit number : ");
        int n = input.nextInt();

        int fourthDigit = n%10;
        int thirdDigit = (n/10)%10;
        int secondDigit = (n/100)%10;
        int firstDigit= (n/1000)%10;

        if (firstDigit+secondDigit == thirdDigit+fourthDigit)
            System.out.println(n + " is a lucky number.");
        else
            System.out.println(n + " is not a lucky number.");
    }
}
