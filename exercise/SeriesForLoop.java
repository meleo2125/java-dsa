import java.util.Scanner;

public class SeriesForLoop {
    public static void main(String[] args) {
        //series
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of queries : ");
        int q = input.nextInt();

        for(int i=0;i<q;i++){
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();
            int s = a;
            for(int j=0;j<n;j++){
                s=s+(int)(Math.pow(2,j))*b;
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }
}
