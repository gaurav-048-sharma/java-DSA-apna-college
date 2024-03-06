public class Oops {

    public static void main(String args[]) {
        Pen p1 = new Pen(); // object
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("yellow");
        System.out.println(p1.getColor());

        BankAccount b1 = new BankAccount();
        b1.username = "rohan";
        b1.setPass("abaab");
        b1.num = 12;
        // System.out.println(b1.setPass("abaab"));

        Student s1 = new Student();
        System.out.println(s1.name);
        System.out.println(s1.marks);
        Pen p2 = new Pen();
        p2.setColori("yellow");
        System.out.println(p2.getColori());
    }
}

class BankAccount { // class
    public String username;
    private String password;
    int num = 10;

    public void setPass(String pwd) {
        pwd = password;

    }

}

class Person {
    public String name;
    public String subject;
    int marks;
    private String hell;

    public void message() {
        System.out.println("Hello World!");

    }

}

class Pen {
    private String color;
    public String colori;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    String getColori() {
        return this.colori;
    }

    void setColori(String colorie) {
        this.colori = colorie;
    }

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int number) {
        tip = number;
    }
}

class Student {
    String name;
    int number;
    float percentage;
    int marks;
    // shallow copy
    // Student(Student s1) {
    // marks = new int[3];
    // this.name = s1.name;
    // }

    // deep copy
    // Student(Student s1) {
    // this.marks = new int(s1.marks);
    // }

    Student() { // constructor
        name = "rohan";
        number = 20;
        percentage = 85.76f;
        marks = 93;
    }

    void calcPercentage(int phy, int math, int chem) {
        percentage = (phy + math + chem) / 3;
    }
}
