package palindromenumbers;

public class PalindromeNumbers {
    public static void main(String[] args) {
        int x = 121;
        int p = 1222;
        int t = 0;
        int d = 1;
        int f = 12321;
        int h = 123321;
        System.out.println( x + " " + isPalindrome(x));
        System.out.println( p + " " + isPalindrome(p));
        System.out.println( t + " " + isPalindrome(t));
        System.out.println( d + " " + isPalindrome(d));
        System.out.println( f + " " + isPalindrome(f));
        System.out.println( h + " " + isPalindrome(h));
    }


    static public boolean isPalindrome(int x){
        char[] xStr = Integer.toString(x).toCharArray();
        int endPointer = xStr.length-1;
        for (int i = 0; i < xStr.length; i++) {
            if (xStr[i] == xStr[endPointer]){
                if (i == endPointer){
                    return true;
                }
                endPointer -= 1;
            } else {
                return false;
            }
        }
        return true;
    }
}
//Given an integer x, return true if x is a palindrome, and false otherwise.
