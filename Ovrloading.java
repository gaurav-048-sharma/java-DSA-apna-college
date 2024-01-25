public class Ovrloading {
    public static void main(String args[]) {
        Calc c = new Calc();
        System.out.println(c.sum(1, 2));
        System.out.println(c.sum((float) 1.5, (float) 1.8));
        System.out.println(c.sum(1, 2, 3));

    }
}

class Calc {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
