public class BitManipula {
    public static void Even_odd(int n){
        int bitmask=1;
        if ( (n & bitmask ) == 0) {
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }

    }
    public static void main(String[] args) {
        Even_odd(5646);
        Even_odd(6453);
    }
    
}
