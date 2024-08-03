import java.util.Scanner;

public class ValueReturningMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.println(sum(x,y));
    }
    public static int sum(int x, int y){
        if(x>0 && y>0)
            return x + y;
        else
            return 0;
    }
}
