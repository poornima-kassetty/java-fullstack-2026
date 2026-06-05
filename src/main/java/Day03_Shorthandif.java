import java.util.Scanner;

public class Day03_Shorthandif
{
    public static void main(String args[])
    {
        System.out.print("Enter the age of person: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        String msg = (age>=18)? "This person is eligible for voting" :"This person is not eligible for voting";
        System.out.println(msg);
    }
}
