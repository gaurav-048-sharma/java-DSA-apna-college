public class largest {
    public static int smallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE; // +infinity
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static int largestNumber(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {

        int numbers[] = { 1, 2, 4, 3, 5, 6, 3, 2 };
        int smallest = smallest(numbers);
        int largest = largestNumber(numbers);
        System.out.println("The largest number is " + largest);
        System.out.println("The smallest number is " + smallest);
    }
}
