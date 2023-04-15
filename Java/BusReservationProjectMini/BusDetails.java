public class BusDetails {
    private int busNo;
    private int busCapacity;
    private Boolean acOrNot;

    BusDetails(int busNo, int busCapacity,Boolean acOrNot){
        this.busNo = busNo;
        this.busCapacity = busCapacity;
        this.acOrNot = acOrNot;
    }

    public void setBusCapacity(int num){
        busCapacity = num;
    }

    public void isAc(Boolean isac){
        acOrNot = isac;
    }

    public int getBusCapacity(){
        return busCapacity;
    }

    public Boolean getAcOrNot(){
        return acOrNot;
    }

    public int getBusNo(){
        return busNo;
    }

    public void displayBuses(){
        System.out.println("\n_______\nBus No :- "+getBusNo()+"\nBus Capacity :- "+getBusCapacity()+"\nBus Ac or Not :- "+getAcOrNot()+"\n_______");
    }


   
    
}
