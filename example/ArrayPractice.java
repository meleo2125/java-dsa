public class ArrayPractice {
    public static void main(String[] args) {
        int[] number = {1,8,7,6};
        print(number);//passed by reference
        change(number);
        print(number);
        print(new int[] {1,2,3,4});//anonymous array
    }
    public static void change(int[] number){
        for (int i=0;i<number.length;i++)
            number[i] = 1;
    }
    public static void print(int[] number){
        for (int i=0;i<number.length;i++)
            System.out.print(number[i]+" ");
        System.out.println();
    }
}
