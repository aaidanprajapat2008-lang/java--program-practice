public class instanceVariable {

    int age;
    String name;
    double cgpt;
    public static void main(String[] args) {
        instanceVariable s1 = new instanceVariable();
        s1.age = 19;
        s1.name ="aaidan";
        s1.cgpt =7.90;
        System.out.println("my age:- " + s1.age + "\n my name:- " + s1.name + "\n my cgpt:- " + s1.cgpt);
    }
}