public class selection {
    public static void select(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int minpos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minpos] < arr[j]) {
                    minpos = j;
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }

    }

    public static void Print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 7, 8, 3, 4, 4, 32, 6, 4, 7, 9, 4, 1, 3 };
        select(arr);
        Print(arr);
    }
}
