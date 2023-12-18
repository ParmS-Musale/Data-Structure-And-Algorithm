import java.util.*;
public class TDArrCreation {
    public static void main (String args[]){
        int matrix [][] = new int [3][3];
        int n =matrix.length , m = matrix[0].length ; 

        // for input
        Scanner sc = new Scanner (System.in);
            for( int i=0 ; i<m ; i++){
                for ( int j=0 ; j<n ; j++){
                    matrix[i][j] = sc.nextInt();
                }
            }

            // for output
            for(int i=0 ; i<m ; i++){
                for (int j=0 ; j<n ; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

    }
    
}
