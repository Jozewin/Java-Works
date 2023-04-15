import java.util.Scanner;

public class Multipliation_table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the limit :- ");
        int limit = in.nextInt();
        System.out.println("Enter the multiplication number :- ");
        int multi = in.nextInt();

        for (int i = 1;i<=limit ; i++)
        {
            System.out.println(i+" x "+limit+" = "+(multi*i));
        }
    }
}
