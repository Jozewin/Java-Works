import java.util.Scanner;

public class Sum_Average
{
    public static void main(String[] args) {

         //To do sum and average of n number of numbers

        Scanner in=new Scanner(System.in);
        System.out.println("Enter the n times :- ");
        int n = in.nextInt();
        int sum = 0;
        for (int i=1;i<=n;i++)
        {
            System.out.println("Enter the number "+i+" is ");
            int a = in.nextInt();
            sum+=a;
        }
        System.out.println("The sum of the given numbers is "+sum);
        System.out.println("The average of the given number is "+sum/n);
    }
}
