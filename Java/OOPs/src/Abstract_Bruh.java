public class Abstract_Bruh {
    public static void main(String[] args) {
        MIUI rn10 = new MIUI();
        rn10.call();
        rn10.screen();
        rn10.fingerprint();

        System.out.println("___________________________________-");
        OP oop = new OP();
        oop.call();
        oop.screen();
        oop.fingerprint();


    }

}
/*
abstract class Example{
    abstract void circle();

    void Tri()
    {
        System.out.println("Wakkali dei ");
    }
}

class summa extends Example
{

    @Override
    void circle() {
        System.out.println("Wakkali dei yepdi mass ah ");
    }
}
*/

// Diffrentiating cell phones

abstract class Phone {
    // Three important fearures call,screen,fingerprint
    void call()
    {
        System.out.println("You can make voice call");
    }

    abstract void screen();
    abstract void fingerprint();
}

class MIUI extends Phone
{

    @Override
    void screen() {
        System.out.println("MIUI has 6 inch display");
    }

    @Override
    void fingerprint() {
        System.out.println("Has in display fingerprint");
    }
}

class OP extends Phone
{

    @Override
    void screen() {
        System.out.println("OP has 5.4 inch Screen or display");
    }

    @Override
    void fingerprint() {
        System.out.println("Also have in display fingerprint");
    }
}

