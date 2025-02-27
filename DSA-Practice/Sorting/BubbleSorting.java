
class BubbleSorting {
    public static void main (String[] args){
        int a[] = {13, 46, 24, 52, 20, 9};
        sorting(a,a.length);
    }
    static void sorting(int a[], int n ){
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array is :");
        for(int i=0;i<n;i++){
            System.out.printf("%d ",a[i]);
        
        }  
    }
}
