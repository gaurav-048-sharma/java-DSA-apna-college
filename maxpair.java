public class maxpair {
    public static void maxsubPair(int numbers[]) {
        int currSum = 0;
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i <= numbers.length; i++) {
            for (int j = i; j <= numbers.length; j++) {
                currSum = 0;
                for (int k = i; k <= numbers.length; k++) {
                    currSum = currSum + numbers[k];
                }
                System.out.println(currSum);
                if (sum < currSum) {
                    sum = currSum;
                }
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8 };
        maxsubPair(numbers);
    }
}
