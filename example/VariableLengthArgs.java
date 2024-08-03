public class VariableLengthArgs {
    public static void main(String[] args) {
        int[] numbers = {2,-5,4,9};
        System.out.println(sum(numbers));
        System.out.println(sum(2,5,4,-7,6,7));
    }
    public static int sum(int... numbers){
        int sum = 0;
        for (int i = 0;i < numbers.length;i++)
            sum += numbers[i];
        return sum;
    }
}
