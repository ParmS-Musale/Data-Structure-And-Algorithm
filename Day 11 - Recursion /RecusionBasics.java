
public class RecusionBasics {
    public static void Dec_number(int n){
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.println(n);
        Dec_number(n-1);
    }
    public static void main(String[] args) {
        int n =10;
        Dec_number(10);
    }
    
}
