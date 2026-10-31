class stringRev{
    public static void main(String [] args){
        String name = "non";
        String rev ="";
        for(int a = name.length(); a<=0; a++){
            rev =  name.charAt(a)+ rev;
        }
        System.out.println("revers String:- "+ rev);
    }
}