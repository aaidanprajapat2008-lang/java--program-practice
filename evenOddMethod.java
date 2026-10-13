
import java.util.Scanner;

public class evenOddMethod {

    static int a;

    static {
        Scanner al = new Scanner(System.in);
        System.out.println("enter the frist number:- ");
        a = al.nextInt();
    }

    static void evenoddnum() {
        if (a % 2 == 0) {
            System.out.println("it is the even number:- " + a);
        } else {
            System.out.println("it is the odd number");
        }
    }

    static void fact() {
        int sum = 1;
        for (int i = 1; i <= a; i++) {
            sum = sum * i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        evenoddnum();
        fact();
    }
}
