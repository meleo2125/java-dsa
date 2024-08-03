public class BinarySearchRecursion {
	public static void main(String[] args) {
		int[] arr = {2,4,6,7,10,13,21,33,55};
		System.out.println(binaryRecursion(0,arr.length-1,2,arr));
	}
	static int binaryRecursion(int start,int end,int target,int[] arr){
		if(start > end) return end;

		int mid = start + (end-start)/2;
		if(arr[mid] > target){
			return binaryRecursion(start,mid-1,target,arr);
		}
		else{
			return binaryRecursion(mid+1,end,target,arr);
		}
	}
}