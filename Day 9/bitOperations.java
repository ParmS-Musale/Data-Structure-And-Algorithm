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

    // UPDATE ITH BIT

    public static int updatebit(int n ,int i , int newbit){
        if (newbit == 0){
            return clearbit(n, i);
        }else{
            return Setbit(n, i);
        }
    }

    //CLEAR LAST ITH BIT

    public static int clear_lastBit(int n, int i){
        int bitmask =(~0 )<< i;
        return n & bitmask ; 
    
    }
    //CLEAR ITH BIT IN RANGE

    public static int clearBitInRange(int n, int i, int j){
        int a =(~0 )<< j+1;
        int b=(1<<i)-1;
        int bitmask = a | b ;
        return n & bitmask ; 
    }
    //CHECK IS POWER OF TWO

    public static boolean IsPowerOfTwo(int n){
        return (n &(n-1))==0;
    }
    public static void main(String[] args) {
        //System.out.println(getithbit(10, 2));
       // System.out.println(clearbit(10, 1));
       // System.out.println(updatebit(10, 2, 1));
      //  System.out.println(clear_lastBit(15, 2));
    //   System.out.println(clearBitInRange(10, 2, 4));
    System.out.println(IsPowerOfTwo(15));
    }

    
}
