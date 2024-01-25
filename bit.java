import java.util.Scanner;

public class bit {
    // odd or even
    public static int oddeve() {
        int n = 4;
        int m = 1;
        int sum = m << n;
        for (int i = 1; i < sum; i++) {
            if (sum == 0) {
                System.out.println("ehy");
            } else {
                System.out.println(sum);
            }

        }
        return 0;

        // int i = 1;
        // if ((n & i) == 0) {
        // System.out.println("even");
        // } else {
        // System.out.println("odd");
        // }

    }

    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // oddeve();
        // System.out.println(3 << 3);

    }
}
