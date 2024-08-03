public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,8,11,23,45,55,65,66,71,74,85,96};
        System.out.println(binarySearch(arr,71));

    }
    private static int binarySearch(int[] arr,int i) {
        int start=0, end=arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if (i>arr[mid]){
                start = mid + 1;
            }
            else if (i<arr[mid]){
                end = mid - 1;
            }
            else return mid;
        }
        return -1;
    }
}
