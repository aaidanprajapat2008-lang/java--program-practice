import java.util.*;
public class revers{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the frist number:- ");
        int a= sc.nextInt();
        int revers = 0;
        for(int num= a; num<=0; num/=10){
        int digit = num%10;
        revers = digit*10+revers;
        System.out.println();
        }
    }
}