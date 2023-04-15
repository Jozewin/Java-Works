import java.util.Scanner;

public class Modulus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Finding factor for the given number
        System.out.println("Enter the number to which u want to get factor for :- ");
        int num = in.nextInt();

        System.out.println("The factors are.....");

        for (int i = 1; i<=num; i++)
        {
            if (num%i==0)
            {

                System.out.println(i);

            }
        }
    }
}
