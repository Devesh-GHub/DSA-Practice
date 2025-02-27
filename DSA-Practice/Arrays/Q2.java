//Find Second Smallest and Second Largest Element in an array

class Q2 {
    public static void main(String[] args) {
        int arr[] = {9,2,5,12,6,3,8};
        int max =arr[0];
        int min = arr[arr.length-1];
        int second_max = arr[arr.length-2];
        int secound_min= arr[1];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                second_max = max;
                max = arr[i];
            }
            else if (arr[i] > second_max && arr[i] != max) {
                second_max = arr[i];
            }

            if(arr[i]<min){
                secound_min = min;
                min = arr[i];
            }
            else if (arr[i] < secound_min && arr[i] != min) {
                secound_min = arr[i];
            }

        }

        System.out.printf("Max value: %d  Min value: %d\n  Second Max: %d  Second Min: %d",max,min,second_max,secound_min);

    }
}
