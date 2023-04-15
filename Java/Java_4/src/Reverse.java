import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        // To reverse a given n value

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number :- ");
        int n = in.nextInt();
        int reverse = 0,rem;

        while (  n!=0)
        {
            rem = n % 10;
            reverse = (reverse*10)+rem;
            n=n/10;
        }
        System.out.println("Reversed form :- "+reverse);


    }
}
