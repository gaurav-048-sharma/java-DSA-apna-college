public class array {
    public static void arr() {
        int[][] phy = {
                { 12, 12, 21 },
                { 43, 34, 76 }

        };
        System.out.println(phy[1][0]);

    }

    public static void arry(int numbers[]) {
        int totalpair = 0;
        for (int i = 0; i < numbers.length; i++) {
            int cur = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + cur + "," + numbers[j] + ")");
                totalpair++;
            }
            System.out.println();
        }
        System.out.println(totalpair);
    }

    public static void subarrray(int numbers[]) {

    }

    public static void main(String args[]) {
        // arr();
        int numbers[] = { 2, 3, 4, 5, 6, 7 };
        arry(numbers);

    }
}
