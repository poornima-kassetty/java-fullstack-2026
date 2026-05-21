public class Day02_Calculator {
    public static void main(String args[])
    {
        int x, y,p,q;
        x=110;
        y=12;
        p=++x;
        //q=++y;
        System.out.println("====Hard coded calculator=====");
        System.out.println("value of x: "+x);
        System.out.println("value of y: "+y);
        System.out.println("sum of x and y: " + (x+y));
        System.out.println("Product of x and y : "+(x*y));
        System.out.println("value of (x/y) :"+(x/y));
        System.out.println("value of x%y :" +(x%y));
       System.out.println("increment of x by 1: "+p);
        System.out.println("increment of y by 1: "+ ++y);
        System.out.println("decrement of x by 1: "+ --x);
        System.out.println("Decrement of y by 1: "+ --y);
    }
}