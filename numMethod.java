
import java.util.*;

public class numMethod {

    static void addNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the frist  number:- ");
        int a = sc.nextInt();
        System.out.println("enter the second number:- ");
        int b = sc.nextInt();
        System.out.println("add two number :- " + (a + b));
        System.out.println("sud two number :- " + (a - b));
        System.out.println("multi two number :- " + (a * b));
        System.out.println("divi two number :- " + (float) (a / b));
    }

    public static void main(String[] args) {
        addNum();
    }
}
