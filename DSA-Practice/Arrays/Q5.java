//Check if an Array is Sorted
// ( Given an array of size n, write a program to check if the given array is sorted in 
//   (ascending / Increasing / Non-decreasing) order or not. 
//    If the array is sorted then return True, Else return False. );

public class Q5 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 5};
        int min = arr[0];
        int max = arr[arr.length - 1];
        int n = arr.length - 1;
        
        if (max - min > 0) {
            System.out.println(ascending(arr, n) );
        } else {
            System.out.println(descending(arr, n) ); 
        }
    }
    
    static boolean ascending(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; // Array is not sorted in ascending order.
            }
        }
        return true; // Array is sorted in ascending order.
    }

    static boolean descending(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] < arr[i + 1]) {
                return false; // Array is not sorted in descending order.
            }
        }
        return true; // Array is sorted in descending order.
    }
}
