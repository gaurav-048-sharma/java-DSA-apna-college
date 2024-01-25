import java.util.*;

public class strings {
    public static boolean printLetter(String str) {
        // for (int i = 0; i < str.length(); i++) {
        // System.out.print(str.charAt(i));
        // }
        // System.out.println();
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) == str.charAt(n - 1 - i)) {
                return true;
            }
        }
        return false;
        // pelandrone
    }

    public static void main(String args[]) {
        String str = "noon";
        // char arr[] = { 'a' };
        // String str = new String("rohan sharma");
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // strings are immutable
        // System.out.println(name1.length());
        // String name1 = "rohan";
        // String name2 = "sharma";
        // String name = name1 + " " + name2;
        // int n = 10;
        // int m = 20;
        // System.out.println(n + m);
        // System.out.println(name.charAt(2));
        System.out.println(printLetter(str));

    }
}
