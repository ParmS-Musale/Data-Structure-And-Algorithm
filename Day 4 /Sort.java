import java.util.*;
public class SortingX {

    // Bubble Sort

    public static void bubb_sort(int Array[]){
        int n =Array.length;
        for(int i=0 ; i<n-1 ; i++){
            for( int j=0 ; j<n-1-i ; j++){
                if (Array[j]> Array[j+1]) {
                    // swap
                    int temp= Array[j];
                    Array[j]= Array[j+1];
                    Array[j+1]=temp;
                }
            }
        }
    }

    public static void print_arry(int Array[]){
        for( int i=0; i<Array.length ; i++){
            System.out.print(Array[i] +" " );
        }
        System.out.println();
    }


    // Selection Sort

    public static void selec_sort(int Array[]){
        // outer looop
        int n= Array.length;
        for(int i=0 ; i<n-1 ; i++){
            int minpos=i;
            for(int j=i+1 ; j<n ; j++){
                if (Array[minpos] > Array[j]){
                    minpos=j ;
                }
            }
            // swaping
            int temp = Array[minpos];
            Array[minpos]= Array[i];
            Array[i]= temp;
        }

    }

    // INSERTION SORT

    public static void Inse_sort(int Array[]){
        int n= Array.length;
        for(int i=1 ; i<n ; i++){
            int curr = Array[i];
            int prev = i-1;

            // finding out correct position to insert
            while (prev>=0 && Array[prev]> curr) {
                Array[prev+1] = Array[prev];
                prev--;
            }
            // insertion
            Array[prev+1] = curr;
        }
    }
    public static void main(String[] args) {
        int Array[]={5,4,1,3,2};
        Inse_sort(Array);
        print_arry(Array);
    }
    
}
