import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string  - ");
        String a = in.nextLine();

        StringBuffer b = new StringBuffer();

        for (int i =a.length()-1;i>=0;i--)
        {
            b.append(a.charAt(i));
        }
        System.out.println(b);


    }
}
