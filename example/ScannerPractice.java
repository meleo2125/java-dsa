import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name :");
        String s2 = input.nextLine();
        System.out.println("My name is " + s2);

        System.out.print("Enter first number : ");
        int i1 = input.nextInt();
        System.out.print("Enter second number : ");
        int i2 = input.nextInt();
        System.out.println("The Addition is : " + (i1 + i2));
    }
}
