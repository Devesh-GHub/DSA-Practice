
public class Q4_2 {
    public static void main(String[] args) {
        int arr[] = {4, 1, 2, 1, 2};
        int max = arr[0];
        int n = arr.length;
        for(int i = 0; i<n ;i++){
            max = Math.max(max, arr[i]);
        }
        System.out.println(max);
        int a[] = new int[max+1];
        while(max>0){
            a[arr[max]]++;
            max--;
        }
        for(int i = 0; i < n ; i++){
            if(a[arr[i]]>1){
                System.out.printf("2 times repeated: %d\n",arr[i]);
            }
        }
    }
}
