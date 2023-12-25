public class TillingProblem {
    public static int Tille_problem (int n) {
        if (n==0 || n==1) {
            return 1;
        }
        // vertically
        int fnm1 = Tille_problem(n-1);

        // Horizontally
        int fnm2 = Tille_problem(n-2);

        int Totalways =fnm1 + fnm2  ;
            return Totalways;
    }
    public static void main(String[] args) {
        System.out.println(Tille_problem(3));
    }
    
}
