// Single inheritance

class Father{
    public void house()
    {
        System.out.println("Has a house");
    }
}

class Son extends Father{
    public void car ()
    {
        System.out.println("Son has a car");
    }
}



public class Get_Sset {
    public static void main(String[] args) {
        Son o = new Son();
        o.house();
        o.car();

    }
}