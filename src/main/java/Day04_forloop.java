import java.util.Scanner;

public class Day04_forloop {
    public static void main(String[] args) {
        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for( int i = x; i>0; i--)
        {
            for(int j=i; j>0; j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}