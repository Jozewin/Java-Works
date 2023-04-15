package Mini_Project;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.*;
import java.lang.reflect.*;
public class Bus_Resv {
    public static void main(String[] args) {
        ArrayList<BusDetails> buses = new ArrayList<BusDetails>();
        buses.add(new BusDetails(1, 2, true));
        buses.add(new BusDetails(2,20,false) );
        buses.add(new BusDetails(3,20,true) );


        ArrayList<BookerDetail> bookers = new ArrayList<BookerDetail>();

        for (BusDetails b:buses)
        {
            b.BusDetailsDisp();
        }
        int enter = 1;

        while (enter == 1) {
            System.out.println("Enter 1 for Booking\nEnter 2 to cancel...");
            Scanner in = new Scanner(System.in);
            enter = in.nextInt();

            if (enter == 1)
            {

                BookerDetail Booker = new BookerDetail();

                if (Booker.isAvailable(buses,bookers))
                {
                    bookers.add(Booker);
                    System.out.println("Your booking is confirmed");
                }else {
                    System.out.println("Sorry booking full in this date");
                }

            }else
            {
                System.out.println("Cancelling the booking ");
            }
        }


    }
}


class BusDetails
{
    private int BusNo;
    private int BusCapacity;
    private Boolean ac;

    BusDetails(int no,int cap,boolean ac)
    {
        this.BusNo = no;
        this.BusCapacity = cap;
        this.ac= ac;
    }

    public int getBusCapacty() {
        return BusCapacity;
    }

    public Boolean getAc() {
        return ac;
    }

    public int getBusNo() {
        return BusNo;
    }

    public void setBusCapacity(int busCapacity) {
        BusCapacity = busCapacity;
    }

    public void setAc(Boolean ac) {
        this.ac = ac;
    }

    public void setBusNo(int busNo) {
        BusNo = busNo;
    }

    public void BusDetailsDisp()
    {
        System.out.println("Bus Details...");
        System.out.println("Bus No - "+BusNo+"\nBus Capacity - "+BusCapacity+"\nAC/NON-AC - "+ac+"\n__________");
    }

}

class BookerDetail {
    String PassangerName;
    int PassangerNo;
    Date date;

    BookerDetail() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name :- ");
        PassangerName = in.next();
        System.out.println("Enter Bus No    :- ");
        PassangerNo = in.nextInt();
        System.out.println("Enter the date dd/mm/yyyy :- ");
        String Enterdate = in.next();

        SimpleDateFormat d = new SimpleDateFormat("dd/mm/yyyy");
        try {
            date = d.parse(Enterdate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }

    public boolean isAvailable(ArrayList<BusDetails> buses, ArrayList<BookerDetail> bookers) {
        int capa = 0;
        for (BusDetails Detail : buses) {

            if(Detail.getBusNo()==PassangerNo)
            {
                capa = Detail.getBusCapacty();
            }
        }

        int booked = 0;
        for (BookerDetail bd : bookers)
        {
            if(bd.PassangerNo == PassangerNo && bd.date.equals(date))
            {
                booked++;
            }
        }

        return booked<capa?true:false;
    }
}



