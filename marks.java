import java.util.*;
public class marks{
public static void main(String[] args){
Scanner ap = new Scanner(System.in);
System.out.println("enter the English marks:- ");
float a = ap.nextInt();
System.out.println("enter the hindi marks:-  ");
float b= ap.nextInt();
System.out.println("enter the physice marks:- ");
float c=ap.nextInt();
System.out.println("enter the chmestry marks:- ");
float d=ap.nextInt();
System.out.println("enter the math marks:-  ");
float e = ap.nextInt();
float f = a+b+c+d+e;
System.out.println("totle marks:- "+(f));
System.out.println("prisent in the totle marka:- "+(f/5));

}
}