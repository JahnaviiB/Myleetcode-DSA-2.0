public class equalstrings {
    public static boolean checkEqual(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();

        // If lengths are different, strings cannot be equal
        if (n1 != n2) {
            System.out.println("Strings are not equal");
            return false;
        } else {
            // Compare each character of both strings
            for (int i = 0; i < n1; i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    return false; // If any character doesn't match, return false
                }
            }
            return true; // If all characters match, return true
        }
    }

    public static void main(String[] args) {
        boolean result = checkEqual("Jahnn", "Jahn");
        System.out.println(result);
    }
}
