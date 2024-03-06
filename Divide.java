import java.util.*;

public class Divide {
    public static int mergesort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 2, 1, 5, 3, 4, 6, 8 };
        // System.out.print(merge(arr));
        mergesort(arr);
    }
}
