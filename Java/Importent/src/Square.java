import java.util.*;
public class Square {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char k = in.next().charAt(0);
        int num = k;
        System.out.println(num);


        for (int i = num;i>=65;i--)
        {
            for (int j =65;j<=num;j++)
            {
                System.out.print((char)num);

            }num--;
            System.out.println();
        }
    }
}

/*
        *
      * *
    * * *
 */
