import java.util.Scanner;

public class StarPatterns {
    public static void main(String[] args) {
        //star pattern
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a integer : ");
        int n = input.nextInt();

        for (int i = 1;i <= n;i++){
            for (int j = 1;j <= n-i;j++){
                System.out.print(" ");
            }
            for (int j = 1;j <= i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

       for (int i = 1;i <= n;i++){
           for (int j = 1;j <= n-i;j++){
               System.out.print(" ");
           }
           for (int j = 1;j <= (2*i-1);j++){
               System.out.print("*");
           }
           System.out.println();
       }

       for (int i = 1;i <= n;i++){
           for (int j = 1;j <= n-i;j++){
               System.out.print(" ");
           }
           for (int j = 1;j <= (2*i-1) ;j++){
               if (i == n){
                   System.out.print("*");
               }
               else if (j==1 || j==2*i-1)
                   System.out.print("*");
               else
                   System.out.print(" ");
           }
           System.out.println();
       }

       for (int i = 1;i <= n;i++){
           for (int j = 1;j <= n;j++){
               System.out.print("*");
           }
           System.out.println();
       }

       for (int i = 1;i <= n;i++){
           for (int j = 1;j <= n;j++){
               if (i==1 || i==n)
                   System.out.print("*");
               else if (j==1 || j==n)
                   System.out.print("*");
               else
                   System.out.print(" ");
           }
           System.out.println();
       }

       for (int i = 1;i <= n;i++){
           for (int j = 1;j <= n;j++){
               if (i==1 || i==n)
                   System.out.print("*");
               else if (j==1 || j==n)
                   System.out.print("*");
               else
                   System.out.print(" ");
           }
           System.out.println();
       }

       for (int i = 1;i <= n;i++){
           for (int j = 1;j <= n;j++){
               if (i==1 || i==n)
                   System.out.print("*");
               else if (j==1 || j==n)
                   System.out.print(" ");
               else
                   System.out.print("*");
           }
           System.out.println();
       }
    }
}
