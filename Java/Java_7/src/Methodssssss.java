import java.util.Scanner;

class Fun{

    // No return without arguments
     public void sum(){
         Scanner in = new Scanner(System.in);
         System.out.println("Enter value of a :- ");
         int a = in.nextInt();
         System.out.println("Enter value of b :- ");
         int b = in.nextInt();
         int c = a+b;
         System.out.println("Sum of a and b is "+c);
     }
     // No return with argument
    public void sub(int x,int y){
        System.out.println("Subtraction of "+x+" - "+y+" = "+(x-y));
    }

    // Return type without argument
    public int multy(){
        int x = 1213;
        int y = 13;
        return x*y;
    }

    // Return type with arguments

    public int divide(int a,int b){
         return a/b;
    }

    public int Factorial (int n ){

         if (n==1)
             return 1;
         else
             return (n*Factorial(n-1));
    }



}
public class Methodssssss {
    public static void main(String[] args) {
        Fun o = new Fun();
        o.sum();
        System.out.println(" ");
        o.sub(123433323,43423);
        System.out.println(" ");
        System.out.println("Multiplication :- "+o.multy());
        System.out.println(" ");
        System.out.println("Division       :- "+o.divide(1233,4));
        System.out.println("Factorial of 20:- "+o.Factorial(5));

    }
}
