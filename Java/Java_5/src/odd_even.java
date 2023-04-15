import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        // To count number of odd and even number in the entered arrays

        int e=0,o=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the limit :- ");
        int limit = in.nextInt();

        int a[]=new int[limit];

        for (int i = 0 ; i<limit;i++)
        {
            System.out.println("Enter a["+i+"] :- ");
            a[i]=in.nextInt();
        }

        for (int element : a)
        {
            if (element%2==0)
            {
                e++;
            }else {
                o++;
            }
        }
        System.out.println("Total number of even numbers :- "+e);
        System.out.println("Total number of odd numbers  :- "+o);

    }
}
