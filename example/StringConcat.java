public class StringConcat {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "def";
        String s3 = s1 + " " + s2;

        System.out.println("mukesh" + "prajapat");
        System.out.println("mukesh" + " " + "prajapat");
        System.out.println(s1 + " " + s2);
        System.out.println(s3);

        System.out.println("Mukesh " + 5);
        System.out.println("Mukesh " + 5 + 3);
        System.out.println("Mukesh " + (5 + 3));
        System.out.println(5 + 3 + " Mukesh");

        System.out.println("Mukesh".concat("Prajapat").isEmpty());
        String s10 = new String("hii");
    }
}
