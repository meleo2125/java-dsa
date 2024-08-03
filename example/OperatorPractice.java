public class OperatorPractice {
    public static void main(String[] args) {
        //Assignment operator
        int x = 1;
        int y = x = 2;
        x = x + 1;
        x += 1;
        System.out.println("x = " + x + " and " + "y = " + y);

        //Addition operator
        int add = 1 + 4;
        System.out.println("sum : " + add);
        System.out.println("sum : " + (5 + 2));

        //Subtraction operator
        int sub = 7 - 4;
        System.out.println("sub : " + sub);
        System.out.println("sub : " + (5 - 2));

        //Multiplication operator
        int mul = 2 * 4;
        System.out.println("mul : " + mul);
        System.out.println("mul : " + 5 * 2);

        //Division operator
        double div = 1 / 2;
        System.out.println("div : " + div);//implicit casting
        System.out.println("div : " + 4 / 2);

        //Increment
        int i = 1;
        System.out.println(i++);//post-increment
        int j = 1;
        System.out.println(++j);//pre-increment

        //Decrement
        int k = 2;
        System.out.println(k--);//post-decrement
        int l = 2;
        System.out.println(--l);//pre-decrement
    }
}
