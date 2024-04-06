public class sorting_techniques {
    public static void main(String[] args) {
        // SORTING TECHNIQUES HELP IN SORTING THE GIVEN DATA

        /**** Basic sorting techniques ****/

        // Bubble Sort
        // Selection Sort
        // Insertion Sort


        //  1. Bubble Sort :- 
         /*runs loop n-1 times to sort and pushes largest element to end . I f we reverse the condition then it will push smallest element to end and will give descending sorted array. */

         int[] arrayNumbers = {1,4,2,6,3};

         for(int i = 0; i <= arrayNumbers.length - 1; i++ ){
            for (int j = 0; j<arrayNumbers.length-i-1; j++){
                if (arrayNumbers[j] > arrayNumbers[j+1]) {
                    int a = arrayNumbers[j];
                    arrayNumbers[j] = arrayNumbers[j+1];
                    arrayNumbers[j+1] = a;
                }
            }
        }

        for(int i = 0; i<arrayNumbers.length;i++){
            System.out.println(arrayNumbers[i]);
        }

        // 2. Selection Sort :- 
        /*
         * we select one compare it with all other numbers until the number smaller then it is found , once a smaller number is found , we make it default and compare with rest of numbers. and after the end we do only one swapping per iteration.
         */

         int[] arraySelectionSort = {7,5,2,8,9};

         for(int i = 0 ; i < arraySelectionSort.length - 1; i++ ){
            int smallest = i;
            for ( int j = 0 ; j <arraySelectionSort.length; j++){
                if (arraySelectionSort[smallest] >arraySelectionSort[j]){
                    smallest = j ; 

                }
            }

            int temp = arraySelectionSort[smallest];
            arraySelectionSort[smallest] = arraySelectionSort[i];
            arraySelectionSort[i] = temp;
         }

         for (int i = 0 ; i <arraySelectionSort.length; i++){
             System.err.println(arraySelectionSort);
         }


        // Insertion Sort:- 

        /*
         * This works on process of making a key and comparing it until the smaller number appears on unsorted side.
         * 
         * the array is split into sorted and unsorted part.Values from the unsorted part are taken and placed in correct position in sorted part.
         * 
         * process:- 
         * to sort, iterate over array and compare current element to its predecessor, if the key element is smaller than predecessor, compare it to element before.Move greater elements one position up to make space for the swapped element.
         */

         int[] arr = {4,8,5,3,2};
         for (int i = 1; i <arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while (j >=0 && current <arr[i]){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = current;
         }

          for (int i = 0 ; i <arr.length; i++){
             System.err.println(arr);
         }
    }
}
