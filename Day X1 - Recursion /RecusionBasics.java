
public class RecusionBasics {

    // Number Decrement

    public static void Dec_number(int n){
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.println(n);
        Dec_number(n-1);
    }
    
    // Number Increment

    public static void Inc_number(int n){
        if (n == 1) {
            System.out.print(n);
            return;
        }
        Inc_number(n-1);
        System.out.println(n);
    }
    
    // find Factorial
    
    public static int Fact(int n){
        if (n == 0) {
            return 1;
        }
        int fnm1 = Fact (n-1);
        int Fn = n * Fact(n-1);
        return Fn;
    }

    // find Sum Of Natural Number
    
    public static int PrintSum(int n){
        if (n == 1) {
            return 1;
        }
        int fnm1 = PrintSum (n-1);
        int Fn = n + fnm1;
        return Fn;
    }
    public static void main(String[] args) {
        int n =5;
        System.out.println(PrintSum(5));
    }
    
}
