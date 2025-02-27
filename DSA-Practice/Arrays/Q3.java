
import java.util.HashSet;
import java.util.Set;

//Union of Two Sorted Arrays

public class Q3 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(); 
        int arr1[] = {1,2,3,4,5,6,7,8,9,10} ;
        int arr2[] = {2,3,4,4,5,11,12};

      
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }


        System.out.println("Union of Sorted array is: "+set);

    }
}
