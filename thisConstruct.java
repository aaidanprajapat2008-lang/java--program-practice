public class thisConstruct {
    int a;
    int b;
    int c=a+b;
    thisConstruct(int a,int b, int c){
    this.a=a;
    this.b=b;
    this.c=c;
    }
    public static void main(String[] args) {
        thisConstruct s1 = new thisConstruct(23, 89,10);
        System.out.println(s1.a+s1.b+s1.c);
    }
}
