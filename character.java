public interface character {
    public static void main(String args[]) {
        int n = 5;
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(ch);
                ch++;
            }

            System.out.println();
        }

    }
}
