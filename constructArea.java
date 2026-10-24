
import java.util.*;

class constructArea {

    int r;

    constructArea(int a) {
        r = a;
    }

    double area1() {
        double area = r * r * Math.PI;
        return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the frist number;- ");
        int a = sc.nextInt();
        Double b = 3.14d;
        constructArea s1 = new constructArea(a);

        System.out.println(s1.area1());

    }
}
