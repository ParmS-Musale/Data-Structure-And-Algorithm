public class firstOccurance {
    public static int First_occurance(int arr[], int key, int i){
        if (i==arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return First_occurance (arr,key, i+1);
    }
    public static void main(String[] args) {
    int arr[]={ 8,4,6,9,7,3,2,5,1,0};
    int key =9;
    int i= 0;
    System.out.println(First_occurance(arr, key, i));        
    }
    
}
