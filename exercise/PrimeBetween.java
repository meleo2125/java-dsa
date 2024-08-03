import java.util.Scanner;

public class PrimeBetween {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        printPrimeBetween(input.nextInt(),input.nextInt());
    }
    public static boolean isPrime(int n){
        for (int i = 2 ; i <= n/2;i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static void printPrimeBetween(int start, int end){
        for (int i=start;i<=end;i++){
            if (isPrime(i))
                System.out.print(i+" ");
        }
    }
}
