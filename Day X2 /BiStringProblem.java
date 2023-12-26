public class BiStringProblem {
    public static void printString(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        if (lastPlace == 0) {
            printString(n - 1, 0, str + "0");
            printString(n - 1, 0, str + "1");
        } else {
            printString(n - 1, 0, str + "0");
        }
    }

    public static void main(String[] args) {
        printString(3, 0, "");
    }
}
