//import java.util.*;

public class factorial {
    public static int facto(int n) {
        int f = 1;
        // if (n == 1) {
        // return 1;
        // }
        // f = n * facto(n - 1);

        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        System.out.println(facto(5));
        // facto(5);
    }
}
