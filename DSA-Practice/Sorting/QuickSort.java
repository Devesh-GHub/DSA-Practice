
import java.util.ArrayList;

class QuickSort {
    public static void main(String[] args) {
        int arr[] = {4,6,2,5,7,9,1,3};
        QuickSort(arr,arr.length);
    }

    static void QuickSort(int arr[], int lenght){
        ArrayList<Integer> al = new ArrayList<>();
        int p = arr[0];
        nullInit(lenght);
        int left = 1;
        int right = 1;
        al.add(p,p);
        for (int i =0; i<=p;i++){
            if(p>arr[i]){
                al.add(p-left,arr[i]);
                left ++;
            }
            else{
                al.add(p+right,arr[i]);
                right ++;
            }
        }

        static ArrayList<Integer> nullInit(int lenght){
            ArrayList<Integer> al = new ArrayList<>(lenght);
            while(lenght>=0){
                al.add(null);
                lenght --;
            }
            return al;
        }

    }
}
