import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the integer : ");
        int i = input.nextInt();

        if (i % 2 == 0){
            System.out.println(i + " is even.");
        }
        else {
            System.out.println(i + " is odd.");
        }

        switch (i % 2){
            case 0:
                System.out.println(i + " is even.");
                break;
            case 1:
                System.out.println(i + " is odd.");
        }
    }
}
