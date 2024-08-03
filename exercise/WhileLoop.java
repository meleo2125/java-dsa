import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
//        sum of number till exceeding 100
        Scanner input = new Scanner(System.in);

        int sum = 0;

        while(sum<=100){
            System.out.print("Enter a number : ");
            sum+=input.nextInt();
        }
        System.out.println("Done : "+sum);
    }
}
