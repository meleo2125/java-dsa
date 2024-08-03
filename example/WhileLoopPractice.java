import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 10 : ");
        int num = input.nextInt();

        while (num<1 || num>10){
            System.out.println("Try again: ");
            num = input.nextInt();
        }
        System.out.println(num + " is between 1 and 10");
    }
}
