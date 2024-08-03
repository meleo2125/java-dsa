import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayFill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int n = in.nextInt();
        while (n < 1 || n > 20) {
            System.out.println("Invalid, Try again!");
            n = in.nextInt();
        }
        Point[] points = new Point[n];
        fillArray(points);
        printArray(points);
    }
    public static void fillArray(Point[] points){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < points.length; i++) {
            System.out.print("Enter x an y : ");
            points[i] = new Point(in.nextInt(),in.nextInt());
        }
    }
    public static void printArray(Point[] points){
        System.out.print("The elements are : ");
        for (int i = 0;i < points.length;i++)
            System.out.print("(" + points[i].x + "," + points[i].y + ") ");
    }
}
