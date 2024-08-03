import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {54,63,2,7,9,20,16,3,1};
        bubblesort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void bubblesort(int[] nums) {
        boolean swapped = false;
        for(int i = 0;i<nums.length;i++){
            for(int j = 1;j<nums.length-i;j++){
                if(nums[j]<nums[j-1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }
}
