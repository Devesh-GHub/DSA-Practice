//Find the Largest element in an array

class Q1 {
    public static void main(String[] args) {
        int arr[] = {8,10,5,7,9};
        int i = 0;
        int max = 0;
        while(i != arr.length){
            if(max<arr[i]){
                max = arr[i];
            }
            i++;
        }
        System.out.println("Highest element is :"+max);
    }
}