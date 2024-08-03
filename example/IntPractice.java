public class IntPractice {
    public static void main(String[] args) {
        byte b1=5;
        short s1=100;
        int i1=1000;
        long l1=10000L;

        System.out.println(i1-l1); //no error because only using the values
        System.out.println(s1-i1);
        System.out.println(s1-b1);

        //Automatic type conversion
        l1=i1+s1+b1; //s1 and b1 converted to int hence stored in l1
        System.out.println(l1);
    }
}
