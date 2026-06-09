import java.util.Scanner;

public class Day02_Calculator {
    public static void main(String[] args)
    {
        int x, y;
        //x=110;
        //y=12;
        System.out.println("====Scanner calculator=====");
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter value of x :");
        x=sc.nextInt();

        System.out.print("Enter value of y :");
        Scanner sc1 = new Scanner(System.in);
        y=sc1.nextInt();
       // p=++x;
        //q=++y;
       // System.out.println("====Hard coded calculator=====");
        System.out.println("value of x: "+x);
        System.out.println("value of y: "+y);
        System.out.println("sum of x and y: " + (x+y));
        System.out.println("Product of x and y : "+(x*y));
       if (y!=0)
        System.out.println("value of (x/y) :"+(x/y));
       else
           System.out.println("here y value is zero so division is not possible and its value is infinity");

       System.out.println("value of x%y :" +(x%y));
       System.out.println("increment of x by 1: "+ ++x);
        System.out.println("increment of y by 1: "+ ++y);
        System.out.println("decrement of x by 1: "+ --x);
        System.out.println("Decrement of y by 1: "+ --y);
    }
}