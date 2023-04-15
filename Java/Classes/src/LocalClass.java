public class LocalClass {
    public static void main(String[] args) {
        Bois i = new Bois();
        i.Display();

    }
}

class Bois
{
    void Display()
    {
       class Inner
       {
           void InnerBoi()
           {
               System.out.println("Wommala dei");
           }
       }
       Inner o = new Inner();
       o.InnerBoi();
    }

}
