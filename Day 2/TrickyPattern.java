public class xclasses{

    // Print Hollow Rectangle

     public static void Hollo_rect(int trow, int tcolum){
        for (int i=1 ; i<=trow ; i++){
            for (int j=1 ; j<=tcolum ; j++){
                if(i==1 | i==trow | j==1 | j==tcolum){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }  
     } 

     // Print inverted_HAlf-Pyramid

    public static void inv_half_pyramid(int n) {
        // for outer loop
        for (int i=1 ; i<=n ; i++){
            // for blank spaces
            for (int j=1; j<=n-i ; j++){
                System.out.print(" ");
            }
            // for stars
            for(int j=1 ; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Print inverted half pyramid (Numbers)

    public static void inv_half_pyramid_number(int n){
        for (int i=1 ; i<=n ; i++){
            for (int j=1 ; j<=n-i+1 ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // flyod's Triangle Pattern

    public static void flyods_tri(int n){
        int counter=1;
        for (int i=1 ; i<=n ; i++){
            for (int j=1 ; j<=i ; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();

        }
    }

    // Print Zero_one Triangle

    public static void Zero_one_triangle(int n){
        for (int i=1 ; i<=n ; i++){
            for (int j=1 ; j<=i ; j++){
                // even Number
                if((i+j) % 2 == 0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    // Print Butterfly Pattern

    public static void Butterfly_patt(int n){
        // 1st half
        for (int i=1 ; i<=n ; i++){
            // stars
            for (int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            // Spaces
            for (int j=1 ; j<=2*(n-i) ; j++){
                System.out.print(" ");
            }
            // stars
            for (int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half
        for (int i=n ; i>=1 ; i--){
            // stars
            for (int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            // Spaces
            for (int j=1 ; j<=2*(n-i) ; j++){
                System.out.print(" ");
            }
            // stars
            for (int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // print Rhombus Patttern

    public static void solid_Rho(int n) {
        // for outer
        for (int i=1 ; i<=n ; i++){
            // for spaces
            for(int j=1 ; j<=n-i ; j++){
                System.out.print(" ");
            }
            //for stars
            for(int j=1 ; j<=n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

    // print hollow_rhombus

    public static void hollow_Rho(int n){
        // for outer
         for (int i=1 ; i<=n ; i++){
            //for spaces
            for(int j=1 ; j<=n-i ; j++){
                System.out.print(" ");
            }
            // for rhombus
            for(int j=1 ; j<=n; j++){
                if(i==1| i==n | j==1 | j==n){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

// Print diamond Pattern
    public static void dia_patt(int n) {
        // 1st half
        for (int i=1 ; i<=n ; i++){
            // for spaces
            for (int j=1 ; j<=n-i ; j++){
                System.out.print(" ");
            }
            // for stars
            for(int j=1 ; j<=(2*i)-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half
        for (int i=n ; i>=1 ; i--){
            // for spaces
            for (int j=1 ; j<=n-i ; j++){
                System.out.print(" ");
            }
            // for stars
            for(int j=1 ; j<=(2*i)-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String args[]){
        // Hollo_rect(4, 4);
        // inv_half_pyramid(5);
        // inv_half_pyramid_number(5);
        // flyods_tri(5);
        // Zero_one_triangle(5);
        // Butterfly_patt(4);
        // solid_Rho(5);
        // hollow_Rho(4);
        dia_patt(4);
    }
}
