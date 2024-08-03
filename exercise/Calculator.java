import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1 and num2 (Example: 1 + 2) :");
        double d1 = input.nextDouble();
        char  c = input.next().charAt(0);
        double d2 = input.nextDouble();

        if (c =='+')
            System.out.println("The result is : " + (int)(d1+d2));
        else if (c=='-')
            System.out.println("The result is : " + (int)(d1-d2));
        else if (c=='*')
            System.out.println("The result is : " + (d1*d2));
        else if(c=='/')
            System.out.println("The result is : " + (d1/d2));
        else
            System.out.println("Invalid Operator");
    }
}
