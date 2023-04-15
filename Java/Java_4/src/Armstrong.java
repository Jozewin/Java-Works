import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Find it is armstrong or not for the gn 3 digit number
        System.out.println("Enter the number :- "); // 123
        int number = in.nextInt();
        int temp = number;

        int digit1,digit2,digit3;

        digit3 = temp % 10;// 3
        temp = temp / 10; // 12

        digit2 = temp %  10; // 2
        temp = temp /10; // 1

        digit1 = temp % 10; // 1

        int result = (digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);

        if (result == number )
        {
            System.out.println(number+" is Armstrong number");
        }else
        {
            System.out.println(number+" is not Armstrong number");
        }

    }
}
