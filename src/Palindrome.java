public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam, I'm Adam!"));
    }

    private static boolean isPalindrome(String text) {
        String str = text.replaceAll("[^a-zA-Z0-9]", "");
        return str.equalsIgnoreCase(new StringBuffer(str).reverse().toString());
    }
}
