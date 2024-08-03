public class ArrayMInMax {
    public static void main(String[] args) {
        int[] numbers = {1,5,0,7,8};
         int min,max;
         min = max = numbers[0];

         for (int i = 0;i < numbers.length;i++){
             max = numbers[i] > max ? numbers[i] : max;
             min = numbers[i] < min ? numbers[i] : min;
         }
        System.out.println("max = " + max + ", min = " + min);
    }
}
