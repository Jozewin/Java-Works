
public class MethodArgs {
    public static void main(String[] args) {
        getNames("Rama","Bama","Yooo");

    }

    public static void getNames(String ... names)  // ...
    {
        for (String name : names)
            System.out.println(name);
    }
}
