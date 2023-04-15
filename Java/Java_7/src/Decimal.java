import java.util.Scanner;

public class Decimal {
    public  static int Deci(int n)
    {
        // 1 1 0 0 => 0*2^0 + 0*2^1 + 1*2^2 + 1*2^3 =12
        int power = 0 ,decimal = 0;

        while (n != 0) // 1100
        {
            int reminder = n % 10; // 0
            decimal += reminder*Math.pow(2,power);
            n = n/10;
            power++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Binary number :- ");
        int n = in.nextInt();
        System.out.println("The binary value of "+n+" is "+ Deci(n));
    }
}
