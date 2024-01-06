public class StrCompression {
    public static String stringCompress(String str) {
        StringBuilder compressedStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int count = 1;

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            compressedStr.append(str.charAt(i));

            if (count > 1) {
                compressedStr.append(count);
            }
        }
        return compressedStr.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbbccc";
        System.out.println(stringCompress(str));
    }
}
