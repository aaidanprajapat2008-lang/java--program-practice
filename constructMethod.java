
class student {

    int age;
    String name;
    long number;
    String fatherName;
    long rollnum;

    student(int age, String name, long number, String fatherName, long rollnum) {
        this.age = age;
        this.name = name;
        this.number = number;
        this.fatherName = fatherName;
        this.rollnum = rollnum;
    }

    void student() {
        System.out.println("age:- " + age);
        System.out.println("name:- " + name);
        System.out.println("number:- " + number);
        System.out.println("fatherName:- " + fatherName);
        System.out.println("rollnum:this.=- " + rollnum);
    }
}

public class constructMethod {

    public static void main(String[] args) {
        student aaidan = new student(18, "aadain", 735, "dharmChand", 1429);
        student manish = new student(22, "", 735, "dharmChand", 1429);
        aaidan.student();
        manish.student();
    }
}
