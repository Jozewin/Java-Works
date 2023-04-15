import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // Arrays

        //Variable with Arrays

        int a[]={10,20,30,40,50,60};

        System.out.println("The number on 2nd Index is "+a[2]);

        //_________________________________________________________________

        System.out.println("The values are using for loop.....");

        // Accessing it with for loop

        for (int i=0;i<a.length;i++)
        {
            System.out.print("  "+a[i]);

        }

        //_________________________________________________________________

        System.out.println(" ");

        // Accessing the same shit using Enhanced for loop :)

        System.out.println("The values are using Enhanced for loop.....");
        for (int e : a)
        {
            System.out.print("  "+e);
        }

        //_________________________________________________________________

        // declaration

        int b[];

        // Allocating the memory size

        b= new int[10];
        System.out.println(" ");

        for (int i = 0 ; i<10;i++)
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the number "+i+" is ");
            b[i]= in.nextInt();

        }
        System.out.println("The numbers in array are .......");

        for (int element : b)
        {
            System.out.print(element+"  ");
        }

        //_________________________________________________________________
    }
}
