
import java.util.Scanner;
import java.util.Vector;

class vactor {

    public static void main(String[] args) {
        Vector<String> sk = new Vector<String>();
        Vector<Integer> ak = new Vector<Integer>();
        Scanner ap = new Scanner(System.in);
        System.out.println("enter the number for the use Vector: ");
        int a = ap.nextInt();
        for (int i = 0; i < a; i++) {
            String c = ap.nextLine();
            sk.add(c);
        }
        for (String i : sk) {
            String name = ap.nextLine();
            System.out.println(i);
        }

        // String name = ap.nextLine();
        // sk.add("hello");
        // sk.add(name);
        // System.out.println("it is the vactor:- " + sk + ak);
    }
}
