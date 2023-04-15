package AtmProject01;

public class BankProcess {
    int dep,Withdraw;
    double bal;

    BankProcess(){

        this.bal= 0;
        this.Withdraw=0;
        this.dep=0;
    }
    public void checkBal()
    {
        System.out.println("Available Bank balance :- "+bal);
      //  return bal;
    }

    public void depAmount(double cash)
    {
        bal += cash;

        System.out.println("Now available balance is "+bal);
    }
    
}
