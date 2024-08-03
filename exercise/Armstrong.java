import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        for(int i=100;i<1000;i++){
            if(isArmstrong(i)) System.out.print(i+" ");
        }
    }
    static boolean isArmstrong(int n){
        int og = n,sum = 0;
        while(n>0){
            int temp = (n%10);
            sum += temp*temp*temp;
            n /= 10;
        }
        return sum==og;
    }
}
