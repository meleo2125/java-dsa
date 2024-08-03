public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,5,8,11,23,45,55,65,66,71,74,85,96};
        System.out.println(floorNumber(arr,64));
    }

    private static int floorNumber(int[] arr, int i) {
        int start=0, end=arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if (i>arr[mid]){
                start = mid + 1;
            }
            else if (i<arr[mid]){
                end = mid - 1;
            }
            else return arr[mid];
        }
        return arr[end];
    }
}
