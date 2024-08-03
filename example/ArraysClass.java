import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        int[] numbers = {2,8,1,6,3};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers,3));

        char[] chars = {'C','a','e','A'};
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));
        System.out.println(Arrays.binarySearch(chars,'B'));

        String[] strings = {"abc","efg","hij"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.binarySearch(strings,"abc"));

        int[] num1 = {1,2,3};
        int[] num2 = {1,2,3};
        System.out.println(Arrays.equals(num1,num2));

        int[] num3 = new int[4];
        Arrays.fill(num3,2);
        System.out.println(Arrays.toString(num3));
    }
}
