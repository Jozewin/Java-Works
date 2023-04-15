import java.util.Scanner;

public class Switch {
    public static void main(String[] args)
    {
        // Switch case in Java

    /*

    Create a Selection statement command with
    1.Addition
    2.Subtraction
    3.Multiplication
    4.Division

    */
        int a,b,c,ch;
        Scanner in = new Scanner(System.in);
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Enter your choice :- ");
        ch = in.nextInt();
        switch (ch)

        {
            case 1:
                System.out.println("Enter two numbers :- ");
                a=in.nextInt();
                b=in.nextInt();
                c=a+b;
                System.out.println("Addition :- "+c);
                break;

            case 2:
                System.out.println("Enter two numbers :- ");
                a=in.nextInt();
                b=in.nextInt();
                c=a-b;
                System.out.println("Subtraction :- "+c);
                break;

            case 3:
                System.out.println("Enter two numbers :- ");
                a=in.nextInt();
                b=in.nextInt();
                c=a*b;
                System.out.println("Multiplication :- "+c);
                break;

            case 4:
                System.out.println("Enter two numbers :- ");
                a=in.nextInt();
                b=in.nextInt();
                c=a/b;
                System.out.println("Division :- "+c);
                break;

            default:
                System.out.println("Invalid selection");
                break;


        }

    }
}
