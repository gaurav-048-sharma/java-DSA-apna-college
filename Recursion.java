public class Recursion {
    public static void printdec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printdec(n - 1);
    }

    public static void printinc(int a) {
        if (a == 1) {
            System.out.print(a + " ");
            return;
        }
        printinc(a - 1);
        System.out.print(a + " ");

    }

    public static int funFact(int n) {
        if (n == 0) {
            return 1;
        }
        int f = funFact(n - 1);
        int fn = n * f;
        return fn;
    }

    public static int facto(int n) {
        if (n == 1) {
            return 1;
        }
        int f = facto(n - 1);
        int fn = n * f;
        return fn;
    }

    public static int sum(int n) {
        if (n == 1) {
            return n;
        }
        int sum1 = sum(n - 1);
        int sn = n + sum1;
        return sn;
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int sum1 = fibonacci(n - 1);
        int sum12 = fibonacci(n - 2);
        int sum = sum1 + sum12;
        return sum;
    }

    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int sum1 = fibo(n - 1);
        int sum2 = fibo(n - 2);
        int sum = sum1 + sum2;
        return sum;
    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true; // agr
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static boolean sort(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return sort(arr, i + 1);
    }

    public static int occurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return occurance(arr, key, i + 1);
    }

    public static int lastOccur(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isfound = lastOccur(arr, key, i + 1);
        if (isfound == -1 && arr[i] == key) {
            return i;
        }
        return isfound;
    }

    public static int occcu(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return occcu(arr, key, i + 1);
    }

    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        // int xpow = pow(x, n - 1);
        // int xn = x * xpow;
        // return xn;
        return x * pow(x, n - 1);
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    public static int optimized(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optimized(x, n / 2);
        int half = halfPower * halfPower;
        if (n % 2 != 0) {
            half = x * half;
        }
        return half;
    }

    public static void main(String args[]) {
        // int n = 11;
        int arr[] = { 1, 2, 3, 8, 4, 5, 5, 5, 5, 5, 5, 5 };
        // int key = 5;
        // int a[] = { 1, 2, 3, 5 };
        // System.out.println(pow(2, 5));
        /// System.out.println(lastOccur(arr, key, 0));
        // System.out.println(facto(5));
        // int a = 10;
        // printdec(10);
        // printinc(a);
        // System.out.println(occurance(arr, 8, 0));
        System.out.println(occcu(arr, 8, 0));
        // System.out.println(sum(6));
        // System.out.println(fibonacci(n));
        // System.out.print(isSorted(arr, 0));
        // System.out.print(sort(arr, 0));
        // System.out.println(fibo(5));
        System.out.println(power(2, 5));
        System.out.println(optimized(2, 5));
    }
}
