import java.util.Scanner;

public class Prime_or_Not {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //To check whether the given number is prime number  or not

        System.out.println("Enter the number :- ");
        int num = in.nextInt();
        int f = 0;

        for (int i = 1 ;i<=num;i++)
        {
            if (num%i==0)
            {
                f++;
            }
        }

        if(f==2)
        {
            System.out.println(num +" is prime number");
        }else
        {
            System.out.println(num +" is not a prime number");
        }


    }
}
