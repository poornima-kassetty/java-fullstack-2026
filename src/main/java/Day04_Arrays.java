//import java.util.Arrays;
public class Day04_Arrays
{
    public static void main(String[] args)
    {
        int [][]  x=new int [4][4];
        x[0] =new int[]{11, 22, 33, 44};

        x[1] =new int[]{10, 20, 30, 40};
        x[2] =new int[]{11, 21, 31, 41};
        x[3] =new int[]{12, 22, 32, 42};//  x[1]={10,20,30,40,};
       // x[3]= {}
        //x[0][1] = 222;

        for (int i=0; i<x.length;i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i] [j]+ " ,");
            }
            System.out.println();
             }
        String[][] y = new String[3][3];

        y[0] = new String[]{"rose","Lilly","lotus"};
        y[1] = new String[] {"mango","apple","banana"};
        y[2] = new String[]{"bottle guard","Ridge guard","Drum stick"};

        for (int i =0 ;i<y.length ; i++)
        {
            for (int j = 0; j < y[i].length; j++)
            {
                System.out.print(y[i][j] + " , ");
            }
            System.out.println();
        }

    }
}
