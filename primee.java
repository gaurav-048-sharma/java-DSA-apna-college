import java.util.*;

public class primee {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        // for(i=1; i<k; i++) {

        // }
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("Number is not a Prime number");
                break;
            }

        }
        if (i == n) {
            System.out.print("Number is a Prime number");
        }

    }
}
