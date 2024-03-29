import java.util.*;

public class distance {
    public static float shortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            int dir = path.charAt(i);
            if (dir == 'W') {
                x--;
            } else if (dir == 'S') {
                y--;

            } else if (dir == 'N') {
                y++;
            } else {
                x++;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        return (float) Math.sqrt(x2 + y2);
    }

    public static void main(String args[]) {
        String path = "NEWS";
        System.out.println(shortestPath(path));
    }
}
