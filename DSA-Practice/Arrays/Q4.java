
import java.util.HashMap;

public class Q4 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> req = new HashMap<>();
        int arr[] = {4, 1, 2, 1, 2};
        int n = arr.length;

        // Step 1: Count occurrences of each number in the array
        for (int i = 0; i < n; i++) {
            req.put(arr[i], req.getOrDefault(arr[i], 0) + 1);
        }

        // Step 2: Find the number that appears once and the others that appear twice
        for (int i = 0; i < n; i++) {
            int count = req.get(arr[i]);
            if (count == 1) {
                System.out.printf("Number that appears once: %d\n", arr[i]);
            } 
            else if (count > 1) {
                System.out.printf("Number that appears more than once: %d\n", arr[i]);
            }
        }
    }
}
