import java.util.Scanner;

public class Day03_Ifcond {
    public static void main(String args[]) {
        System.out.print("Is weather Raining : if yes press 1 if not press 2  :  2");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        if (i == 1)
            System.out.println("Take umbrella");

        System.out.println("HAVE A NICE DAY");

    }
}