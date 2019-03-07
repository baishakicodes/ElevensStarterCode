package Activity9;

public class sorting {
    public static void swap(String[] arr, int a, int b){
        String temp = arr[a];
        arr[a] = arr[b];
        arr[b]=temp;
    }
    public static void bubbleSort(String[] arr){
        //*another method for bubble sort

        //*the first for loop is for the out iteration
        for(int i =0; i<arr.length; i++){
            //*the second for loop is for the actual swapping in the first outer iteration
            //*the precondition j<arr.length-1 is so that we don't keep on going to the end of the array that is already sorted
            for(int j=1; j<arr.length-i; j++){
                if(arr[j-1].compareTo(arr[j])>0) {
                    swap(arr, j-1,j);
                }
            }
        }
    }
}
