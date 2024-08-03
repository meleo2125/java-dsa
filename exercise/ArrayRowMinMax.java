import java.util.Arrays;

public class ArrayRowMinMax {
	public static void main(String[] args) {
		int[][] integers = {{4,8,7,5,9},
							{7,12,4,63,5},
							{0,2,5,8,7}};
		for (int i = 0;i < integers.length;i++) {
			int max = integers[i][0];
			for (int j = 0;j < integers[i].length;j++) {
				max = (integers[i][j] > max)?integers[i][j] : max;
			}
			System.out.println("Max of row " + (i + 1) + " is: " + max);
		}

		for (int i = 0;i < integers.length;i++) {
			int min = integers[i][0];
			for (int j = 0;j < integers[i].length;j++) {
				min = (integers[i][j] < min)?integers[i][j] : min;
			}
			System.out.println("Min of row " + (i + 1) + " is: " + min);
		}
	}
}