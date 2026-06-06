import java.util.Scanner;

public class Day04_DoWhile
{
    public static void main(String []args)
    {
        System.out.print("Enter any number :");

        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        do
        {
         System.out.print(x);
         x--;
        }
        while(x>0);
    }
}
