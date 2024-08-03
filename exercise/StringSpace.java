import java.util.Scanner;

public class StringSpace {
    public static void main(String[] args) {
        //display string with space
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String string = input.nextLine();

        int len = string.length();
        for (int i=0;i<len;i++) {
            System.out.print(string.charAt(i) + " ");
        }
        System.out.printf("");
    }
}
