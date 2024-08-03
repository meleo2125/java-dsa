import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {4,5,2,3,1};

		for(int i = 0;i < arr.length - 1;i++){
			int max = 0;
			int end = arr.length - i - 1;
			for(int j = 0;j<end;j++) {
				if(arr[max] < arr[j]){
					max = j;
				}
			}
			int temp = arr[max];
			arr[max] = arr[end];
			arr[end] = temp;
		}
	}
}