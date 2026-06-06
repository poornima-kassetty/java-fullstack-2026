import java.util.Scanner;

public class Day04_whileloop
{
    public static void main(String []args)
    {
     int x;
     System.out.print("Enter any number lessthan 10  :");
     Scanner sc = new Scanner(System.in);
     x=sc.nextInt();
    //int y =x;
     while(x>0)
     {
         int y = x;
        while(y>0){
         System.out.print(y);
         y--;
         }
        System.out.println();
        x--;
     }

    }
}
