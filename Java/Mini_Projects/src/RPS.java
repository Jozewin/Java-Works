import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            String[] rps = {"r", "p", "s"};

            String computerMove = rps[new Random().nextInt(rps.length)];
            String YourMove;
            while (true) {
                System.out.println("Enter your move [r,p,s]:- ");
                YourMove = in.nextLine();
                if (YourMove.equals("r") || YourMove.equals("p") || YourMove.equals("s")) {
                    break;
                }
                System.out.println("Invalid Input!!");
            }
            System.out.println("Computer Move :- " + computerMove);
            if (YourMove.equals(computerMove)) {
                System.out.println("The is a Tie  >_<");

            } else if ((YourMove.equals("p") && computerMove.equals("r")) || (YourMove.equals("r") && computerMove.equals("s")) || (YourMove.equals("s") && computerMove.equals("p"))) {
                System.out.println("You Won");
            } else {
                System.out.println("You Lost");
            }


            System.out.println("Do you want to continue [y/n] :- ");
            String PlayAgain = in.nextLine();

            if (!PlayAgain.equals("y"))
            {
                break;
            }
        }





    }
}
