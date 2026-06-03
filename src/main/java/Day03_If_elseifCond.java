import java.util.Scanner;

public class Day03_If_elseifCond {
    public static void main(String args[]) {
        System.out.print("Enter the age of human being :");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x <= 3)
            System.out.println("That human being is a Toddler");
        else if (x <= 12)
            System.out.println("That human being is a child");
        else if (x <= 19)
            System.out.println("That person is a teenager");
        else if (x <= 39)
            System.out.println("That person is an adult");
        else if (x <= 64)
            System.out.println("That person is a middle aged adult");
        else
            System.out.println("That person is senior citizen");
    }
}