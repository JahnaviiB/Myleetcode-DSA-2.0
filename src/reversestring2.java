public class reversestring2 {
    public static String reversestring2(String s1) {
        if ((null == s1) || (s1.length() <= 1)) {
            return s1;
        }
        return reversestring2(s1.substring(1)) + s1.charAt(0);
    }

    public static void main(String[] args) {
        String str = "Jahnavi";
        String result = reversestring2(str);
        System.out.print(result);

    }
}
