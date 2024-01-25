//import java.util.*;

public class parameters {
    public static void swap(int a, int b) // parameters
    {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
