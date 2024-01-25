public class arrray {
    public static void update(int marks[], int m) {
        m = 3;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;

        }

    }

    public static void main(String args[]) {
        int marks[] = { 45, 34, 54 };
        int m = 10;
        update(marks, m);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]); // but here it changed
        }
        System.out.println();
        System.out.println(m); // 10 //but not here
    }
}
