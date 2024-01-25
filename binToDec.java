public class binToDec {
    // binary to decimal conversion
    public static void binary(int binNum) {
        int num = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println(" num of " + num + " = " + decNum);

    }

    public static void main(String args[]) {
        binary(1000101001);
    }
}
