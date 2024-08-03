import java.util.Scanner;

public class ForLoopPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a num between 1 and 10 : ");


        for (int num = input.nextInt();num<1 || num>10;num=input.nextInt()){
            System.out.print("try again: ");
        }
        System.out.println("correct");
    }
}
