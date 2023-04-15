import java.util.Scanner;

public class Uppercase {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String :- ");
        String b = in.nextLine();
        a.append(b);

         for (int i = 0; i<a.length();i++)
         {
             if (a.charAt(i)>=97 && a.charAt(i)<=122)
             {
                 int c = (int)a.charAt(i)-32;
                 a.setCharAt(i,(char)c);
             }
         }
        System.out.println(a);
    }
}
