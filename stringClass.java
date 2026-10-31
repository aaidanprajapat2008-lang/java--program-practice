
class stringClass {

    public static void main(String[] args) {

        String name = "maam";
        System.out.println("orignal String:- " + name);
        String rev = "";
        for (int a = name.length() - 1; a >= 0; a--) {
            rev = rev + name.charAt(a);
        }

        System.out.println("paelodrom the String:-" + rev);
    }
}
