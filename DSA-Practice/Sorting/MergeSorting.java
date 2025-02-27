import java.util.Arrays;

class MergeSorting {
    public static void main(String[] args) {
        int[] a = {9, 4, 7, 6, 3, 1, 5};
        System.out.println("Original Array: " + Arrays.toString(a));
        mergeSorting(a, 0, a.length - 1);
        System.out.println("Sorted Array: " + Arrays.toString(a));
    }

    // Main method to perform merge sort
    static void mergeSorting(int arr[], int min, int max) {
        if (min < max) {
            int middle = findMiddle(min, max);
            
            // Recursively sort first and second halves
            mergeSorting(arr, min, middle);
            mergeSorting(arr, middle + 1, max);
            
            // Merge the sorted halves
            merge(arr, min, middle, max);
        }
    }

    // Helper method to find the middle index
    static int findMiddle(int min, int max) {
        return (min + max) / 2;
    }

    // Method to merge two sorted halves
    static void merge(int arr[], int min, int middle, int max) {
        int n1 = middle - min + 1;
        int n2 = max - middle;

        // Create temporary arrays
        int[] left = new int[n1];
        int[] right = new int[n2];

        // Copy data to temp arrays
        //arraycopy(Source array,starting index in source,destination array, starting index in destination,number of elements to be copy)
        System.arraycopy(arr, min, left, 0, n1);   
        System.arraycopy(arr, middle + 1, right, 0, n2);

        // Merge the temp arrays back into arr[min..max]
        int i = 0, j = 0, k = min;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of left[] if any
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy remaining elements of right[] if any
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
