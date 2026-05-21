public class Day02_variables {
    public static void main (String args[])
    {
        //declaration  and different ways of initializing of different type variables
        int x=11,y,z,a;
        y=22;
        z=33;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        String s,t="hello";
        s= "hai";
      //  t= "hello";
        System.out.println(s);
        System.out.println(t);
        //type casting
        //implicit type casting(widening)
        long p,q=y,r;
        p=x;
        System.out.println(p);
        System.out.println(q);
        //explicit type casting(Narrowing)
        r=123456789988L;
        System.out.println(r);
        a=(int)r;
        System.out.println(a);
    }
}
