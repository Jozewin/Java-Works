class Mathopertaions{
    public int multy(int x ,int y)
    {
        return x*y;
    }
    public double multy(double x ,double y)
    {
        return x*y;
    }
    public double multy(double x ,int y)
    {
        return x*y;
    }
    public int multy(int r)
    {
        return r*r;
    }

}

public class Overloading {
    public static void main(String[] args) {
        Mathopertaions o = new Mathopertaions();
        System.out.println(o.multy(2,3));
        System.out.println(o.multy(2));
        System.out.println(o.multy(2.88,7));

    }
}
