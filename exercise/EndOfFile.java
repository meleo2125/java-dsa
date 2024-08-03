import java.util.Scanner;

public class EndOfFile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int index = 1;
        while(input.hasNextLine()){
            String line = input.nextLine();
            System.out.println(index+" "+line);
            index++;
        }
    }
}