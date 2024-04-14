public class quicksort {

    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i= low -1 ;

        for (int j = low ; j <high; j++){
            if (arr[j] < pivot){
                i++;

                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }

    public static void quicksort(int[] arr, int low , int high) {
        if (low < high){
            int pivot = partition(arr, low,high);
            quicksort(arr, low, pivot-1);
            quicksort(arr, pivot+1, high);
        }
    }
    public static void main(String[] args) {
        /*
         * pivot and partition approach is used.
         * 
         * in this code , last element is considered as pivot 
         */

        int [] arr  = {6,3,9,5,2,8};
        int n = arr.length;
        quicksort(arr, 0 , n-1);
    }
}
