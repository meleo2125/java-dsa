import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {
        int[] nums = {21,545,45,8,10};
        swap(nums,1,4);
        System.out.println(Arrays.toString(nums));
    }
    static void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
    }
}
