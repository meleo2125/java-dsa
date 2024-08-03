import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        //palindrome
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = input.next();

        boolean isPalindrome = true;
        for (int i=0,j=str.length()-1;i<j;i++,j--){
            if (str.charAt(i)==str.charAt(j))
                continue;
            isPalindrome = false;
            break;
        }
        System.out.println(isPalindrome ? "String is palindrome" : "String is not palindrome");
    }
}
