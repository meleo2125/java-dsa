public class StringPractice {
    public static void main(String[] args) {
        String myString = "Mukesh Prajapat";
        System.out.println(myString);

        String myStringUppercase = myString.toUpperCase();
        System.out.println(myStringUppercase);

        String myStringLowercase = myString.toLowerCase();
        System.out.println(myStringLowercase);

        int i = myString.length();
        System.out.println(i);

        System.out.println(myString.isEmpty());

        System.out.println(myString.charAt(5));

        System.out.println(myString.indexOf('a'));
        System.out.println(myString.lastIndexOf('a'));

        System.out.println(myString.concat(" 123"));
    }
}
