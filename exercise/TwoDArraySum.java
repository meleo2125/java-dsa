public class TwoDArraySum {
    public static void main(String[] args) {
        int[][]  integers = {{1,2,5},
                             {5,2,5},
                             {1,5,7}};
        for (int i = 0; i < integers.length; i++) {
            int sum = 0;
            for (int j = 0; j < integers[i].length; j++){
                sum = sum + integers[i][j];
            }
            System.out.println("sum of row " + (i + 1) + " = " + sum);
        }
        for (int i = 0; i < integers[i].length ; i++) {
            int sum = 0;
            for (int j = 0; j < integers.length; j++){
                sum = sum + integers[j][i];
            }
            System.out.println("sum of column " + (i + 1) + " = " + sum);
        }

    }
}
