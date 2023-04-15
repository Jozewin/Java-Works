import java.util.Scanner;
/*
 90 TO 100 GRADE A
 80 TO 89  GRADE B
 70 TO 79  GRADE C
 BELOW 69 GRADE D
*/
public class else_if {
    public static void main(String[] args) {
        float avg;
        System.out.println("Enter a  Mark :- ");
        Scanner in = new Scanner(System.in);
        avg = in.nextFloat();
        if (avg>=90 && avg<=100)
        {
            System.out.println("Grade A");
        }
        else if (avg>=80 && avg<=89)
        {
            System.out.println("Grade B");
        }
        else if (avg>=70 && avg<=79)
        {
            System.out.println("Grade C");
        }
        else
        {
            System.out.println("Grade D");
        }
    }
}
