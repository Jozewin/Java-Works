import java.util.Scanner;

public class For_loop {
    public static void main(String[] args) {
        int a;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the limit :- ");
        a = in.nextInt();

        for (int i=1;i<=a;i++)
        {
            System.out.println(i);
        }
    }
}
