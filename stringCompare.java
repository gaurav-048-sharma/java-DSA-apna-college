
public class stringCompare {
    public static String substring(String str, int s1, int ei) {
        String string = "";
        for (int i = 0; i < ei; i++) {
            string += str.charAt(i);
        }
        return string;
    }

    public static void main(String args[]) {
        String str = "tonystark";
        System.out.println(str.substring(0, 5));
        System.out.println(substring(str, 0, 4));
        // String s2 = "tony";
        // String s3 = new String("tony");

        // if (s1 == s2) {
        // System.out.println("equal");
        // } else {
        // System.out.println("not equal");
        // }

        // if (s1.equals(s3)) {
        // System.out.println("equal");
        // } else {
        // System.out.println("not equal");
        // }
    }
}
