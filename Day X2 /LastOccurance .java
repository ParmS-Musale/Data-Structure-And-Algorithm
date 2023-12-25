public class LastOccurance {
    public static int Last_occurance(int arr[], int key, int i){
        if (i==arr.length) {
            return -1;
        }
        int isFound =Last_occurance( arr ,key ,i+1);
            if ( isFound== -1 && arr[i]== key) {
                return i;
            }
            return isFound;
        }
    public static void main(String[] args) {
    int arr[]={ 8,4,6,9,7,3,9,5,1,0};
    int key =9;
    int i= 0;
    System.out.println(Last_occurance(arr, key, i));        
    }
    
}
