
import java.util.*;

class methodOverloding {

    static int add(int a, int b) {
        int c = a + b;
        return c;
    }

    static int add(int a, int b, int c) {
        int d = a + b + c;
        return d;
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int a = s1.nextInt();
        int b = s1.nextInt();
        int f = add(a, b);
        System.out.println(f);
        int c = s1.nextInt();
        int d = add(a, b, c);
        System.out.println(d);
    }
}
