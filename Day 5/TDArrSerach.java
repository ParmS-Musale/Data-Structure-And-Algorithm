import java.util.*;
    public class TDArrSerach {

        public static void Search(int matrix [][], int key) {
            for( int i=0 ; i<matrix.length ; i++){
                    for ( int j=0 ; j<matrix[0].length ; j++){
                        if (matrix[i][j] == key) {
                            System.out.print("Uurekkaaa at :(" + i + "," + j + ")");
                            // return true;
                            
                        }
                    }
                }
                // return false;
                System.out.println();
        }
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
                Search(matrix, 5);
    
        }
        
    }

