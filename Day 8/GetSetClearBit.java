public class BitManiPulatioon {

    // FOR THE GETBIT

     public static int getithbit(int n ,int i){
         int bitmask = 1<<i ;
         if ((n & bitmask) == 0) {
             return 0;
         }else{
             return 1;
         }
     }
    
    // FOR SETBIT

    public static int Setbit(int n, int i){
        int bitmask = 1 << i;
        return (n | bitmask);
    }

    // CLEAR ITH BIT

    public static int clearbit(int n, int i){
        int bitmask = ~(1 << i);
        return (n & bitmask);
    }
    public static void main(String[] args) {
        //  System.out.println(getithbit(10, 2));
        System.out.println(clearbit(10, 1));
    }
     just random edit
}
