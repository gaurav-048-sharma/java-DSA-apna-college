public class basicSort {
    public static int largest(int numbers[]) {
        int n = numbers.length;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (largest < n) {
                largest = numbers[i];

            }

        }
        return largest;
    }

    public static int smallest(int numbers[]) {
        int n = numbers.length;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (smallest > n) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void bubblesort(int numbers[]) {
        int n = numbers.length;
        for (int turn = 0; turn < n; turn++) {
            for (int j = 0; j < n - 1 - turn; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

    public static void Print(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 5, 8, 6, 4, 1, 2 };
        System.out.println(largest(numbers));
        System.out.println(smallest(numbers));
        bubblesort(numbers);
        Print(numbers);
    }
}
