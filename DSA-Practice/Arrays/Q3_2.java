//Union of Two Sorted Arrays
//In this we are using HashMap for union. HashMaps are similar to dictionary in Python;

import java.util.HashMap;
public class Q3_2 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> union = new HashMap<>();
        int arr1[] = {1,2,3,4,5,6,7,8,9,10} ;
        int arr2[] = {2,3,4,4,5,11,12};

        for(int i = 0; i<arr1.length;i++){
            union.put(arr1[i], union.getOrDefault(arr1[i], 0)+1);   //returns 0 if no match then we add 1 to increase the count
        }
        for(int i = 0; i<arr2.length;i++){
            union.put(arr2[i], union.getOrDefault(arr2[i], 0)+1);
        }

        System.out.println(union.keySet());
    }
}
