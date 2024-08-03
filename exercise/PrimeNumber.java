import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        //prime number
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = input.nextInt();

        if (num==2){
            System.out.println("2 is neither prime nor composite ");
        }
//        else if (num<1) {
//            System.out.println("Invalid number");
//        }
        else {
            boolean isPrime=true;
            for (int i=2;i<=num/2;i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.println(isPrime ? num+ " is prime" : num+ " is not a prime");
        }
    }
}
