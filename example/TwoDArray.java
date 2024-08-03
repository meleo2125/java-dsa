import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int[][]  integers = {{1,2,5},
                             {5,2,5},
                             {1,5,7}};
        System.out.println(Arrays.deepToString(integers));
        for (int i = 0;i < 3;i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(integers[i][j] + " ");
            System.out.println();
        }
    }
}
