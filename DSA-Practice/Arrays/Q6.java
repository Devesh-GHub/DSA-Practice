

public class Q6 {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3};
        int i = 0;
        int j = 0;
        while(i<arr.length){
            if(i<arr.length) {
                j = i+1;
            }
            while(j<arr.length){
                if(arr[i] == arr[j]){
                    j++;
                }
                else{
                    arr[i+1] = arr[j];
                    break;
                }
            }
            i++;
        }
        System.out.println("final arr: "+arr);
    }
}
