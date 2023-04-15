import java.security.PrivilegedExceptionAction;
import java.util.Scanner;

public class CopyCon {
    public static void main(String[] args) {
        complex o = new complex();
        System.out.println(o);

        complex o1 = new complex(121,43);
        System.out.println(o1);

        complex o2 = new complex(o);
        System.out.println(o2);
    }
}

class complex{

    private int r,i;

    complex (int x,int y)   // Parametrised constructor
    {
     // this.i=x
     // this.r=y;
        this.r=x;
        this.i=y;
    }

    //Constructor without anything
    public complex()
    {
    /*    this.r = 10;
        this.i=200;

    */
        Scanner in = new Scanner(System.in);
        System.out.println("enter real number :- ");
        r = in.nextInt();
        System.out.println("enter Imaginary number :- ");
        i = in.nextInt();

    }

    // Creating copy constructor

    public complex(complex o )
    {
        this.r=o.r;
        this.i=o.i;
    }

    // To create a complex number type
    public String toString()
    {
        return "("+r+"+"+i+"i)";
    }


}
