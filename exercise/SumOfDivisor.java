import java.util.Scanner;

public class SumOfDivisor {
    public static void main(String[] args) {
        //sum of strict divisors
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = input.nextInt();
        int sum =0;

        for (int i=1;i<=num/2;i++){
            if(num%i==0){
               sum = sum + i;
            }
        }
        System.out.println("sum of strict divisor of "+num+" is : "+sum);
    }
}
