import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        //reverse string
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String string = input.nextLine();

        for(int i=string.length()-1;i>=0;i--) {
            System.out.print(string.charAt(i));
        }
    }
}
