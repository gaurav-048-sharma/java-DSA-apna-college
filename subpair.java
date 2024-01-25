//import java.util.*;

public class subpair {
    public static void sub(int numbers[]) {
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) {

            for (int j = i; j < numbers.length; j++) {

                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                    tp++;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(tp);
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        sub(numbers);

    }
}
