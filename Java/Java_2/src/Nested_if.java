import java.util.Scanner;

public class Nested_if {
    public static void main(String[] args) {
        /*
          Nested if statement
             Insurence bruhhh
             a.If the user is married
             b.If the user is unmarried  male and age is greater than 30
             c.If the user is unmarried female and age is greater than 25
        */
        Scanner in = new Scanner(System.in);
        System.out.println("Write down the martial status M/U :- ");
        char martial = in.next().charAt(0);
        if (martial =='u' || martial =='U')  // or 
        {
            System.out.println("Enter your Gender :- ");
            char gender = in.next().charAt(0);
            System.out.println("Enter your Age :-");
            int age = in.nextInt();
            if ((gender == 'm' || gender == 'M') && (age>=30)) {   System.out.println("You are valid to assure the Insurence");}
            
            else if ((gender == 'f' || gender == 'F') && (age>=25)) {System.out.println("You are valid to assure the Insurence"); }
            else      {   System.out.println("You are not valid to assure the insurence");
        }
        else if (martial == 'm' || martial == 'M')
        {
            System.out.println("You are valid to assure the insurence ");
        }
        else
        {
            System.out.println("Invalid output");
        }
    }
}
