public class Nested_for {
    public static void main(String[] args) {
        /*

        To write a program to print
        *
        **
        ***
        ****
        *****

        */
        for (int i = 1; i <= 5; i++)
        {

            for (int j = 1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}