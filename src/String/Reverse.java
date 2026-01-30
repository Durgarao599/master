package String;

public class Reverse {

    public static void main(String[] args) {


        System.out.println(  isPalindrome(122));
    }

    public static boolean isPalindrome(int x) {
        // Convert the integer to a string
        String original = Integer.toString(x);
        // Reverse the string
        String reversed = new StringBuilder(original).reverse().toString();
        String reverse = new StringBuffer(original).reverse().toString();

        System.out.println("Using StringBuffer: "+original.equals(reverse));
        // Compare the original and reversed strings
        return original.equals(reversed);
    }
}
