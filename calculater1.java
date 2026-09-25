import java.util.*;
public class calculater1{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the erist number:- ");
	 int a=sc.nextInt();
	 System.out.println("enter the second number:-  ");
	 int b=sc.nextInt();
	 char c = sc.next().charAt(0);
	 switch(c){
     case '+':System.out.println("add two number:- " +(a+b));
	 break;
	 case'-': System.out.println("subtraction two number:- "+(a-b));
	 break;
	 case '*':System.out.println("multiplication two number:- "+(a*b));
	 break;
	case '/':System.out.println("divisction two number:- "+(a/b));
	break;
	default :System.out.println("it is the different charrecar");
	}
}
}