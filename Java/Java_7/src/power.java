public class power {
    public static void main(String[] args) {
        System.out.println("Power   :- "+Mathematical.square(5,5));
    }
}

class Mathematical
{
    public static int square(int base,int power) // Since we ae using Static keyword we dont need to create a object to call this shit

    {
        int result = 1;
        for (int i = 1;i<=power;i++)
        {
            result=result*base;
        }
        return result;
    }
}
