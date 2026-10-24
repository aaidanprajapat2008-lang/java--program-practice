 class areaCiraleConstruct{
    int r;
    areaCiraleConstruct(int r){
        this.r=r;
    }
    double area(){
        return r*r*3.14;
    }
    public static void main(String[] args){
        areaCiraleConstruct s1=new areaCiraleConstruct(2);
       System.out.println( s1.area());
    }
 }