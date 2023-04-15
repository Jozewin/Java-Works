// Static variable and Static method

import java.util.stream.StreamSupport;

public class Static_Test {
    public static void main(String[] args) {
        Test o = new Test();
        o.kaami();

        Test o1 = new Test();
        o.y = 000;
        o.x = 3322;
        o.kaami();

        Test o2 = new Test();
        o2.kaami();



    }
}

class Test
{
    int x = 100;
    static int y = 122;

    void kaami()
    {
        System.out.println("x - "+x+" y - "+y);
    }

    static void display()
    {
        System.out.println(y);
    }

}
