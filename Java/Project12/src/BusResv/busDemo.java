package BusResv;

import java.util.ArrayList;
import java.util.Scanner;

public class busDemo {
    public static void main(String[] args) {

        ArrayList<bus> buses = new ArrayList<>();
        buses.add(new bus(1,true,20));
        buses.add(new bus(2,false,25));
        buses.add(new bus(3,true,15));

        for (bus b:buses)
        {
            b.BusInfoDiplay();
        }


        int opt = 1;
        while(opt==1) {  // Booking selection screen
            System.out.println("Enter Number 1 for booking\nNumber 2 to exit");
            Scanner in = new Scanner(System.in);
            opt = in.nextInt();

            if (opt == 1)
            {
                System.out.println("Lets start booking");
            }

        }

    }
}
