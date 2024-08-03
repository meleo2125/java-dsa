public class PrintEven {
    public static void main(String[] args) {
        //even numbers from 1 to 100
        for (int i=1;i<=100;i++){
            if (i%2==0)
                System.out.print(i+" ");
       }
        int j=1;
        while(j<=100) {
            if(j%2==0)
                 System.out.print(j + " ");
            j++;
        }
    }
}
