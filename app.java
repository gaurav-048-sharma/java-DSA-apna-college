public class app {
    public static void marks(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;

        }
    }

    public static void main(String args[]) {
        int arr[] = { 94, 93, 73, 83 };
        marks(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
        // for(int i=0; i<marks)
    }
}
