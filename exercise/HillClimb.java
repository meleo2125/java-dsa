import java.util.Arrays;

public class HillClimb {
    public static void main(String[] args) {
        int[][] coordinates = {{1, 2}, {30, 21}, {56, 23}, {8, 18}, {20, 50}, {3, 4}, {11, 6}, {6, 7}, {15, 20}, {10, 9}, {12, 12}};
        int[] goalCoordinate = getHighestCoordinate(coordinates);
        int[] currentCoordinate = coordinates[0];

        while (!Arrays.equals(currentCoordinate, goalCoordinate)) {
            int[] currentNeighbour = getNeighbour(currentCoordinate, coordinates);

            if (currentNeighbour != null && currentNeighbour[1] > currentCoordinate[1]) {
                currentCoordinate = currentNeighbour;
            } else {
                break;
            }
        }
        System.out.println("Highest point: (" + goalCoordinate[0] + ", " + goalCoordinate[1] + ")");
    }
    public static int[] getHighestCoordinate(int[][] coordinates) {
        int[] goalCoordinate = coordinates[0]; // Initialize with the first coordinate
        int yMax = coordinates[0][1];

        for (int i = 1; i < coordinates.length; i++) {
            if (coordinates[i][1] > yMax) {
                yMax = coordinates[i][1];
                goalCoordinate = coordinates[i];
            }
        }
        return goalCoordinate;
    }
    public static int[] getNeighbour(int[] coordinate, int[][] coordinates) {
        int targetX = coordinate[0] + 1;

        for (int i = 0; i < coordinates.length; i++) {
            if (targetX == coordinates[i][0]) {
                return coordinates[i];
            }
        }
        return null;
    }
}
