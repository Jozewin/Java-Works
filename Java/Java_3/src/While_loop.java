import java.util.Scanner;

public class While_loop
{
    public static void main(String[] args) {

        //While loop

        System.out.println("Enter the number :- ");
        Scanner in = new Scanner(System.in);
        int num;
        num = in.nextInt();

        int i = 1;
        while (i<=num)
        {
            System.out.println(i);
            i+=1;

        }
    }
}
