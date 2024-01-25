public class Solution {
    public static void isPalindrome(int x) {
        int r, s = 0, y;
        y = x;
        while (x != 0) {
            r = x % 10;
            s = (s * 10) + r;
            x = x / 10;
        }
        System.out.println(s);
        if (s == y) {
            System.out.println("it is palindrome");
        } else {
            System.out.println("it is not palindrome");
        }
    }

    public static void main(String args[]) {
        isPalindrome(121);
    }
}
