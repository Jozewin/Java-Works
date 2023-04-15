import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter the Year :- ");
        Scanner in = new Scanner(System.in);
        year = in.nextInt();
        if ((year%4==0)||(year%100==0 && year%4==0))
        {
            System.out.println("The given year "+year+" is a leap year");
        }
        else
        {
            System.out.println("The given year "+year+" is not a leap year");
        }
    }
}
