import java.util.Scanner;

public class Day04Switch
{
    public static void main(String []args)
{
    int ch;
    System.out.println("Choose any week day");
    System.out.println(" press 1 for Sunday");
    System.out.println(" press 2 for Monday");
    System.out.println(" press 3 for Tuesday");
    System.out.println(" press 4 for Wednesday");
    System.out.println(" press 5 for Thursday");
    System.out.println(" press 6 for Friday");
    System.out.println(" press 7 for Saturday");
System.out.print("Enter your choice :");
    Scanner sc = new Scanner(System.in);
    ch =sc.nextInt();

    switch (ch) {
        case 1:
            System.out.println("Sunday is holiday");
            break;
        case 2:
            System.out.println("Monday is blue day");
            break;
        case 3:
            System.out.println("Tuesday is green day");
            break;
        case 4:
            System.out.println("Wednesday is white day");
            break;
        case 5:
            System.out.println("Thursday is yellow day");
            break;
        case 6:
            System.out.println("Friday is Orange day");
            break;
        case 7:
            System.out.println("saturday is Red day");
            break;
        default:
            System.out.println("Have a nice Day");
    }
    }
}

