import java.util.Arrays;
import java.util.Scanner;

public class Return {

    public static int[] sortArray()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the limit :- ");
        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0;i<n;i++)
        {
            System.out.println("Enter "+i+" - ");
            a[i] = in.nextInt();
        }
         Arrays.sort(a);

         return a;
    }


    public static void main(String[] args) {

        int [] arr= sortArray();
        System.out.println();

        for (int a : arr)
        {
            System.out.print("  "+a);
        }


    }
}
