import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        // Java program to find the factorial for a given number

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number :- ");
        int n = in.nextInt();
        int f = 1;
        for (int i = 1;i<=n;i++)
        {
            f = f*i;
        }
        System.out.println("The factorial of "+n+" is "+f);
    }
}
