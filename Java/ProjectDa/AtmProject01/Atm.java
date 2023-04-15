package AtmProject01;

import java.sql.Date;
import java.util.Scanner;

public class Atm {
    
    
    public static void main(String[] args) {
        double id,idn;
        int pin,pinu,choice;
        Scanner in = new Scanner(System.in);
        BankProcess bp = new BankProcess();


        id = 8610843334d;
        pin = 2424;

  //      while (true) {
        System.out.println("Enter the mobile number :- ");
        idn = in.nextDouble();
        System.out.println("Enter the Pin :- ");
        pinu = in.nextInt();


  //  }

        while(true)
        {
            System.out.println("__________________________");
            System.out.println("1. Check Balance ");
            System.out.println("2. Deposit Amount ");
            System.out.println("3. Withdraw Amount ");
            System.out.println("4. Exit ");
            System.out.println("__________________________");

            choice = in.nextInt();

            switch(choice){
                case 1:{
                  bp.checkBal();
                    break;
                }
                case 2:
                {
                    System.out.println("Enter the cash amount to deposit :- ");
                    double cash = in.nextDouble();
                    bp.depAmount(cash);
                    break;
                }
            }
        }
    

    }
}
