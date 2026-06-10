import java.util.Scanner;

public class Day05_Recurssion
{
   static int fact(int x)
    {
         int y;
         if (x<0)
             return(-1);
        else if (x==1 || x==0)
            return(1);
        else{
            y = x* fact(--x);
        return y;
    }}
    public static void main(String[] args)
    {
System.out.print("Enter any integer number: ");
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
System.out.print("Factorial of the given number : "+ fact(x));

    }
}
