import java.util.Scanner;

public class Do_While {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a limit :- ");
        int n = in.nextInt();

        int i = 1;
        do {
            System.out.println(i);
            i++;
        }while (i<=n);

    }
}
