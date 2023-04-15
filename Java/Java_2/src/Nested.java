import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
                /*
          Nested if statement
             Insurence bruhhh
             a.If the user is married
             b.If the user is unmarried  male and age is greater than 30
             c.If the user is unmarried female and age is greater than 25
        */

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the marital status M/U :- ");
        char marital = in.next().charAt(0);
        if (marital == 'u' || marital == 'U')
        {
            System.out.println("Enter your gender M/F :- ");
            char gender = in.next().charAt(0);
            System.out.println("Enter your Age :- ");
            int age = in.nextInt();
            if ((gender == 'm' || gender == 'M') && (age>=30))
            {
                System.out.println("You are vALID TO Assure the insurence");
            }
            else if ((gender == 'f' || gender == 'F') && (age>=25))
            {
                System.out.println("You are valid to assure the insurence");
            }
            else
            {
                System.out.println("Invalid input da ");
            }

        }
        else if (marital == 'm' || marital == 'M')
        {
            System.out.println("You are valid to assure the insurence");
        }
        else
        {
            System.out.println("Invalid input bruh");
        }
    }
}
