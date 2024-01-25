public class smallest {
    public static int sort(int numbers[]) {
        int n = numbers.length;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        System.out.println(smallest);
        return largest;

    }

    public static void main(String args[]) {
        int numbers[] = { 1, 2, 6, 4, 5, 3, 7, 20 };
        int index = sort(numbers);
        System.out.println(index);
    }
}
