import java.util.Scanner;
class twoDArray{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the row:- ");
        int a =sc.nextInt();
        System.out.println("Enter the number of the column:- ");
        int b= sc.nextInt();

        int [][]arr= new int [a][b];
        for(int i = 0; i<=arr.length; i++){
            for(int j = 0; j<=arr.length; j++){
            arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<=arr.length; i++){
            for(int j=0; j<=arr.length; j++){
                System.out.print(arr[i][j] +"  ");
            }
            System.out.println();
        }
    }
}