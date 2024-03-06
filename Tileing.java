public class Tileing {
    public static int tile(int n) {
        if (n == 1) {
            return 1;
        }
        int tile1 = tile(n - 1);
        int t2 = tile1 + tile1;
        return t2;
    }

    public static void main(String[] args) {
        System.out.println(tile(10));
    }
}
