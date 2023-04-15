public class Lambda_Function {
    public static void main(String[] args) {
        Kaka o = new Kaka();
        o.Peak();
    }
}


abstract class Kuruvi
{
    abstract void Bird();
}

class Kaka
{
    void Peak()
    {
        Kuruvi o = new Kuruvi() {
            @Override
            void Bird() {
                System.out.println("Wounderful Kuruvi Brooo");
            }
        };
        o.Bird();
    }


}
