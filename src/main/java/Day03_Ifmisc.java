import java.util.Scanner;

public class Day03_Ifmisc
{
    public static void main(String args[])
    {
        System.out.println("if the person is Indian press : 1");
        System.out.println("if the person is Foriegner press : 2");
        System.out.print("Enter your option : ");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if(opt ==1)
        {
            System.out.print("Enter the age of that person: ");
           Scanner sc1 = new Scanner(System.in);
            int age = sc.nextInt();
            if (age>=18)
            {
                System.out.println("This person is eligible for voting");

            }
            else
                System.out.println("This person is not eligible for voting");
        }
          else
            System.out.println("This person is not eligible for voting");


    }
}
