package BusResv;

public class bus {
    // Bus Details
    private int busNo;
    private boolean ac;
    private int PassCount;

    bus(int Bus,Boolean ac,int count)
    {
        this.busNo = Bus;
        this.ac = ac;
        this.PassCount = count;
    }

    // Get
    public int getPassCount() {
        return PassCount;
    }

    public boolean getac()
    {
        return ac;
    }

    // Set


    public void setPassCount(int passCount) {
        PassCount = passCount;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    void BusInfoDiplay()
    {
        System.out.println("Bus No : "+busNo+"\nAc :-"+ac+"\nCapacity :- "+PassCount+"\n____________________________________________");
    }
}
