// package BackTracking;

public class FindSubSets {
    public static void SubString(String str , String ans, int i) {
        // base case
        if (i == str.length()) {
            if (ans.length() ==0) {
                System.out.println("Null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        // for Yes Choice
        SubString(str, ans + str.charAt(i), i+1);
        // for No choice
        SubString(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";     // Here Is always the No.of subset is always ((2^n))
        SubString(str, " ", 0);
    }
}
