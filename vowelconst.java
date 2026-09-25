import java.util.Scanner;
public class vowelcont{
    public static void main(String[] args){
        Scanner hl = new Scanner(System.in);
        System.out.println("enter the vowel:- ");
         char ch = hl.next().charAt(0); 
         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("it is the vowel charcrater" + ch);
         }
         else{
            System.out.println("it is the  the consotent" + ch);
         }
    }
}