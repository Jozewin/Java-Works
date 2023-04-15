public class InnerClass {
    public static void main(String[] args) {
        System.out.println("__________________________________");

        Outer o = new Outer();
        o.OuterKaami();
        System.out.println("__________________________________");
        Outer.Inner i = new Outer().new Inner();
        i.InnerKaami();
        System.out.println("__________________________________");

        //  System.out.println();
    }
}

class Outer
{
    int a = 100;

    void OuterKaami(){
        Inner o = new Inner();
        System.out.println("B variable is - "+o.b);
        o.InnerKaami();
        System.out.println("Entha pathuko");
    }

    class Inner
    {
        int b = 12343;

        void InnerKaami()
        {
            Outer i = new Outer();

            System.out.println("Variable a - "+i.a);
            System.out.println("Etha pakatha ");
        }
    }

}