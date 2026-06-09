import java.util.Scanner;

public class Day05_Methods
{
    static void welmessage()
   {
    System.out.println("Welcome to java");
    }
    static void mymethod(String s)
    {
        System.out.println("Welcome to "+s);
    }
    static int add(int x,int y)
    {
        return(x+y);
    }
    static double add(double x,double y)
    {
        return(x+y);
    }
    public static void main(String[] args)
    {
                welmessage();
                String str = "poornima";
                mymethod(str);
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter your name: ");
                String str1 = sc.next();
                mymethod(str1);
                int a,b;
                a=10;
                b = 20;
                System.out.println("sum of a and b: " +add(a,b));
                double x = 2.23,y=3.56;
                System.out.print("sum of 2.23 and 3.56 :"+add(x,y));

    }


    }

