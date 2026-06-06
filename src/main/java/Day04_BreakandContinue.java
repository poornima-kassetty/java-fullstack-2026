public class Day04_BreakandContinue
{
    public static void main(String[] args)
{
    int[] x = {2,5,1,7,44,32,0,14,1,18};
    for(int y : x)
    {
        if(y==1)
            continue;

        if (y == 0)
            break;
         System.out.print(y+", ");


    }
}
}
