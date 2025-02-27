
class SelectionSorthing {
    public static void main(String[] args) {
        int a[] = {13, 46, 24, 52, 20, 9};
        sorting(a, a.length);
    }
    static void sorting(int a[],int n){
        for(int i =0; i<n;i++){
            int min = i;
            for(int j = i+1;j<n;j++){
                if(a[min] > a[j]){
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }

        System.out.println("Sorted array is :");
        for (int i =0;i<n;i++){
            System.out.printf("%d ",a[i]);
        }
    }
}
