// Static class

public class Static {
    public static void main(String[] args) {
        Veliya.Ulla o = new Veliya.Ulla();
        o.display();
    }
}

class Veliya
{
    static int x = 100;
    int y = 12121;

    static class Ulla
    {
        public void display()
        {
            System.out.println(x);
        }
    }
}
