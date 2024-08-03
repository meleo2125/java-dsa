import java.util.Scanner;

public class FibonacciSeries {
    //fibonacci series
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of the fibonacci series : ");
        int len = input.nextInt();

        int num1 = 1;
        int num2 = 1;
        int numAtLen=0;
        System.out.print(num1+" "+num2);
        for (int i=1;i<=len-2;i++) {
            numAtLen = num1 + num2;
            System.out.print(" "+numAtLen);
            num1 =num2;
            num2 = numAtLen;
        }
        System.out.println();
        System.out.println("Number at " + len + (len==1?"st":(len==2?"nd":"th")) + " position : " + (numAtLen==0 ? 1 : numAtLen));
    }
}
