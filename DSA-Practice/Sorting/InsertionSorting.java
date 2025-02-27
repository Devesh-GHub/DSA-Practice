

class InsertionSorting {
    public static void main(String[] args) {
        int a[] =  {13, 46, 24, 52, 20, 9};
        sorting(a,a.length);
    }
    static void sorting(int a[], int n){
        for(int i = 1; i<n; i++){
            for(int j = i;j>0;j--){
                while(a[j]<a[j-1]){
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }
        System.out.println("Sorted array is: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ",a[i]);
        }
    }
}
