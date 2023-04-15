import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rn = new Random();
        int user;
        int comp = rn.nextInt(100)+1;
        System.out.println(comp);

        System.out.println("Enter a number to guess between 1 to 100 :- ");
        user = in.nextInt();

        //    while(user != comp)
    //    {
            for (int i = 4;i>0;i--)
            {


                System.out.println("Rounds remaining..."+i);

                    if (user > comp) {
                        System.out.println("Guess Lower...");
                        user = in.nextInt();

                    } else if (user < comp) {
                        System.out.println("Guess higher...");
                        user = in.nextInt();
                    } else if (user > 100) {
                        System.out.println("Enter a valid number ");
                        user = in.nextInt();
                    }
                    if (user == comp) {
                        System.out.println("You Freaking won");
                        break;
                    }

                    if (i==1)
                    {
                        System.out.println("Poda Mairu");
                        break;
                    }


            }

       // }
    }
}
