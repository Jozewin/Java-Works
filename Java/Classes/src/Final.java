public class Final {
    public static void main(String[] args) {
        Dummy o = new Dummy(322);
        o.Display();
    }
}

class Dummy
{
    final int BOX = 123;
    final int SQ;
    final int PP;


    Dummy(int sq) {
        SQ = sq;
        PP = 23423;
    }

    void Display ()
    {
        System.out.println(BOX);
        System.out.println(SQ);

        System.out.println(PP);

    }
}