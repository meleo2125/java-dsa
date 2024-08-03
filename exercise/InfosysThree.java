import java.util.*;

public class InfosysThree {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++){
			arr[i] = in.nextInt();
		}

		int maxLength = 0;
		int currentLength = 1;

		for(int i = 1;i < arr.length;i++){
			if((arr[i] & arr[i - 1]) * 2 < (arr[i] | arr[i - 1])) {
				currentLength++;
			}
			else{
				maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
			}
		}
		System.out.println(maxLength);
	}
}