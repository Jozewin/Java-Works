public class lol {
    public static void main(String[] args) {
        // To find armstrong numbers from 100 to 999

        for (int number = 100;number <= 999;number++)
        {
            int digit1,digit2,digit3,temp=number,result;

            digit3 = temp % 10;// 3
            temp = temp / 10; // 12

            digit2 = temp %  10; // 2
            temp = temp /10; // 1

            digit1 = temp % 10; // 1

            result = (digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);

            if (result == number )
            {
                System.out.println(number+" is Armstrong number");
            }
        }
    }
}
