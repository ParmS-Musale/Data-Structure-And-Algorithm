public class ReverseArray {
    public static void printArr(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void changeArry(int arr[], int i, int val){
        // base case
        if (i== arr.length) {
            printArr(arr);
            return;
        }
        // Recursion
        arr[i] =val;
        changeArry(arr, i+1, val+1);// increasing value (function call Step)
        arr[i] =arr[i]-1 ;  // Here Shradha Didi Takes 2 for decrement
    }
    public static void main(String[] args) {
        int arr[] = new int [5];
        changeArry(arr, 0, 1);
        printArr(arr);

    }
    
}
