public class MethodOverload {
    public static void main(String[] args) {
        sayHi();
        sayHi("Mukesh");
        System.out.println(Mukesh.add(2,3));
        System.out.println(Mukesh.add(2,3,4));
    }
    public static void sayHi(){
        System.out.println("Hi");
    }
    public static void sayHi(String myString){
        System.out.println("Hi " + myString);
    }
}
class Mukesh{
    public static int add(int a,int b){
        return a+b;
    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }
}
