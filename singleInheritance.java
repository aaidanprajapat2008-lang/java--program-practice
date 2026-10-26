
class child {

    String myName = "aaidan prajapat";
    int myAge = 19;
}

class singleInheritance extends child {

    String fatherName = "dharm chand";
    int fatherage = 45;

    public static void main(String[] args) {
        singleInheritance s1 = new singleInheritance();
        System.out.println(s1.myName + "\t" + s1.myAge + "\n" + s1.fatherName + s1.fatherage
        );
    }
}
