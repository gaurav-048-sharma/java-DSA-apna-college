import java.util.*;

public class trapRain {
    public static int trappingRain(int heigth[]) {
        int n = heigth.length;
        // calc left max
        int leftMax[] = new int[n];
        leftMax[0] = heigth[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(heigth[i], leftMax[i - 1]);
        }

        // calc right max
        int rightMax[] = new int[n];
        rightMax[n - 1] = heigth[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(heigth[i], rightMax[i + 1]);
        }
        // formula
        int trapWater = 0;
        for (int i = 0; i <= n - 1; i++) {
            trapWater += Math.min(leftMax[i], rightMax[i]) - heigth[i];

        }
        return trapWater;

    }

    public static void main(String args[]) {
        int heigth[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.print(trappingRain(heigth));
    }
}
