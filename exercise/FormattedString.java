import java.util.Scanner;

public class FormattedString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        int i1 = input.nextInt();
        String s2 = input.next();
        int i2 = input.nextInt();
        String s3 = input.next();
        int i3 = input.nextInt();

        System.out.println("================================");
        System.out.printf("%-14s %03d%n",s1,i1 );
        System.out.printf("%-14s %03d%n",s2,i2 );
        System.out.printf("%-14s %03d%n",s3,i2 );
        System.out.println("================================");
    }
}