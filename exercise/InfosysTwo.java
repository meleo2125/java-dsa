import java.util.*;

public class InfosysTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value for n:");
        int n = in.nextInt(); // Range of values (1 to n)
        System.out.println("Enter value for k:");
        int k = in.nextInt(); // Size of each permutation
        
        // List to store all possible permutations
        List<List<Integer>> result = new ArrayList<>();
        
        // Call the recursive function to generate permutations
        generatePermutations(n, k, new ArrayList<>(), result);
        
        // Print all possible permutations
        for (List<Integer> permutation : result) {
            System.out.println(permutation);
        }
    }
    
    // Recursive function to generate permutations
    public static void generatePermutations(int n, int k, List<Integer> current, List<List<Integer>> result) {
        // Base case: if the current permutation is of size k
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        // Try all values from 1 to n
        for (int i = 1; i <= n; i++) {
            current.add(i); // Add current value
            generatePermutations(n, k, current, result); // Recur with the updated list
            current.remove(current.size() - 1); // Backtrack
        }
    }
}
