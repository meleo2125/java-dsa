import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num,maxNum,minNum;
        System.out.println("Enter the numbers : ");
        num = input.nextInt();
        maxNum=minNum=num;


        boolean b=true;
        while(num>=0){
            num=input.nextInt();
            if (num<0) {
                b=false;
                break;
            }
            if (num>maxNum)
                maxNum=num;
            if (num<minNum)
                minNum=num;
        }
        if (b)
            System.out.println("invalid");
        else
            System.out.println("min : "+minNum+" and "+"max : "+maxNum);

//        if (num>=0){
//            while(true){
//                num=input.nextInt();
//                if (num<0)
//                    break;
//                if (num>maxNum)
//                    maxNum=num;
//                if (num<minNum)
//                    minNum=num;
//            }
//            System.out.println("min : "+minNum+" and "+"max : "+maxNum);
//        }
//        else
//            System.out.println("Invalid");
    }
}
