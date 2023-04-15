import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        int f = 0;
        System.out.println("The prime numbers between 1 to 999 are..........");

        for (int n=1;n<=999;n++)
        {
            for (int i = 1;i<=n;i++)
            {
                if (n%i==0)
                {
                    f++;
                }
            }
            if (f==2)
            {
                System.out.print(n+",");
            }
            f=0;
        }

    }
}
