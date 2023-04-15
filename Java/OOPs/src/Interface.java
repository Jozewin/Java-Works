public class Interface {
    public static void main(String[] args) {
        smartphone o = new smartphone();

        o.text();
        o.call();
        o.mp();
        o.company();

    }
}

// Phone

class phone {
    void text ()
    {
        System.out.println("We can text using any phone");
    }
    void call()
    {
        System.out.println("We can call from any phones");
    }

}

interface camera
{
    void mp();
    void company();
}


class smartphone extends phone implements camera
{

    @Override
    public void mp() {
        System.out.println("This phone has 16mp camera");
    }

    @Override
    public void company() {

        System.out.println("Samsung");
    }
}