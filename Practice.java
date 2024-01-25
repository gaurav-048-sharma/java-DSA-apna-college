public class Practice {
    public static void pract(int arr[]) {
        System.out.println(arr.length - 1);
    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 3, 4, 5, 6, 7 };
        pract(arr);
        Student s = new Student();
        // s.name = "rohan";

        System.out.println(s.name);
        System.out.println(s.marks);
    }

}

class Student {
    String name;
    int marks;

    Student() { // constructor
        name = "rohan";
        marks = 99;
    }

}
