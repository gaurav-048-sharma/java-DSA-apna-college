public class linSearch {
    public static int linerar(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }

        }
        return -1;

    }

    public static int linear(String arrr[], String key) {
        for (int i = 0; i < arrr.length; i++) {
            if (arrr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        String arrr[] = { "dosa", "idly", "sambhar", "cjhole" };
        String key = "idly";
        int index = linear(arrr, key);
        // int key = 10;

        // int index = linerar(arr, key);
        System.out.println(index);
        if (index == -1) {
            System.out.println("Element is not present in the array");
        } else {
            System.out.println("Element is present at index " + index);
        }

    }
}
