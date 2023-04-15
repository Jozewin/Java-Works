import java.util.Scanner;

public class Strong {
    public static void main(String[] args) {
        int num,Orginal,rem,i,fact,sum=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        num = in.nextInt(); //145
        Orginal = num;


        while (num>0)
        {
            rem=num%10; //5 4
            fact=1;
            for (i = 1;i<=rem;i++)
            {
                fact=fact*i; // 1*2*3*4*5
            }
            sum=sum+fact;
            num=num/10; // 14
        }
        if (sum==Orginal)
        {
            System.out.println("It is a Strong number");
        }else
        {
            System.out.println("It is not a Strong number");
        }


    }
}
