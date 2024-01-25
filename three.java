//import java.util.*;

public class three {
    public static void main(String args[]) {
        int ld = 0;
        int s = 0;
        int n = 1831;
        int m = n;
        while (n != 0) {
            ld = n % 10;
            s = (s * 10) + ld;
            // System.out.print(ld + " ");
            n = n / 10;
        }
        System.out.println(s + " ");
        if (s == m) {
            System.out.println("The number is a palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }

    }
}