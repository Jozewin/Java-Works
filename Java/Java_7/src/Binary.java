import java.util.Scanner;

// Decimal to binary

public class Binary {
    public static void Binary2Decimal (int n ) //6
    {
        int [] Binary = new int[1000];
        int i = 0;
        while (n>0)
        {
            Binary[i]=n%2; // 0 1 1
            n=n/2; // 3 1
            i++;
        }
        // 0 1 1
        for (int j = i-1;j>=0;j--)
            System.out.print(Binary[j]);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Decimal number to make it Binary :- ");
        int n = in.nextInt();
        System.out.println("Binary number :- ");
        Binary2Decimal(n);

    }

}
