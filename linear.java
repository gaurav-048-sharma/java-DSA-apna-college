import java.util.*;

public class linear {
    // public static int search(int numbers[], int key) {
    // for (int i = 0; i < numbers.length; i++) {
    // if (numbers[i] == key) {
    // return i;
    // }

    // }
    // return -1;
    // }

    public static int menuu(String menu[], String dish) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == dish) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // int numbers[] = { 1, 2, 3, 4, 10, 5, 10, 10, 6, 23, 33 };
        String menu[] = { "dosa", "kahaja", "payapa", "egg" };
        String dish = "egg";
        // int key = 10;
        int index = menuu(menu, dish);
        // int index = search(numbers, key);

        if (index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index " + index);
        }

    }
}
