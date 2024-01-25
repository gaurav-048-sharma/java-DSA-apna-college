public class swap {
    public static void swaap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    // copy ho rhi hai
    public static void main(String args[]) {
        int x = 5;
        int y = 10;
        swaap(x, y);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        // int temp = x;
        // x = y;
        // y = temp;
        // System.out.println("x = " + x);
        // System.out.println("y = " + y);
    }
}
