public class ArrayTwoDAddition {
	public static void main(String[] args) {
		int[][] integers = {{4,8,7,5,9},
							{7,12,4,63,5},
							{0,2,5,8,7}};

		colAddition(integers);
		rowAddition(integers);
	}

	static void colAddition(int[][] n){
		for (int i = 0;i<n[0].length;i++) {
			int sum = 0;
			for (int j = 0;j<n.length;j++) {
					sum += n[j][i];
			}
			System.out.println("Addition of column " + (i+1) + " is: " + sum);	
		}
	}
	static void rowAddition(int[][] n){
		for (int i = 0;i<n.length;i++) {
			int sum = 0;
			for (int j = 0;j<n[0].length;j++) {
					sum += n[i][j];
			}
			System.out.println("Addition of row " + (i+1) + " is: " + sum);	
		}
	}
}