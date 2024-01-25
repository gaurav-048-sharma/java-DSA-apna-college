public class inheritance {
    public static void main(String args[]) {
        Dog a = new Dog();
        a.eat();
        a.legs = 4;
        System.out.println(a.legs);
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

}

class Mammal extends Animal {
    int legs;

}

class Dog extends Mammal {
    int age;
}
