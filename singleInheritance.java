
class animal {

    void cat() {
        System.out.println(" hello eat ");
    }

}

class singleInheritance extends animal {

    void dog() {
        System.out.println("hello dog ");
    }

    public static void main(String[] args) {
        singleInheritance d1 = new singleInheritance();
        d1.cat();
        d1.dog();
    }
}
