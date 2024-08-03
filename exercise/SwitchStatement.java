import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char letter = input.next().charAt(0);

        switch (letter) {
            case 'A', 'a' -> System.out.println("Able");
            case 'B', 'b' -> System.out.println("Baker");
            case 'C', 'c' -> System.out.println("Charlie");
            case 'D', 'd' -> System.out.println("Dog");
            case 'E', 'e' -> System.out.println("Easy");
            default -> System.out.println("I don't Know!");
        }
    }
}
