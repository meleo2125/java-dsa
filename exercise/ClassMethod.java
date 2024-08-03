public class ClassMethod {
    public static void main(String[] args) {
        System.out.println("Hello");
        Me.sayName();
        Me.sayAge();
    }
}
class Me{
    public static void sayName(){
        System.out.println("Mukesh Prajapat");
    }
    public static void sayAge(){
        System.out.println("18");
    }
}
