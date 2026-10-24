public class construct {
    int age;
    int roll;
    int num;
    int per;
    int sgpa;
    String name;

    construct(int a, int b,int c, int d, int e, String f){
        age = a;
        roll = b;
        num = c;
        per = d;
        sgpa = e;
        name = f;
    }
    public static void main(String[] args) {
        construct s1 = new construct(19,89,56,47,10,"aaidan");
        System.out.println("my age:- "+ s1.age+"\n my rollnumber:- "+ s1.roll+"\n my number:- "+s1.num+"\n my persent:- "+s1.per+"\n my sgpa:- "+s1.sgpa+"my name:- "+s1.name);
    }
}
