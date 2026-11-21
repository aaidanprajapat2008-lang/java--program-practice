
public class exceptionHandling {

    public static void main(String[] args) {
        int invalid = 0;
        int number, count = 0;
        for (int i = 0; i < args.length; i++) {
            try {
                number = Integer.parseInt(args[i]);
            } catch (Exception e) {
                invalid = invalid + 1;
                System.out.println("Invalid number: " + args[i]);
                continue;
            }
            count = count + 1;
        }
        System.out.println("Vaild number:- " + count);
        System.out.println("Invaild number:- " + invalid);
    }
}
