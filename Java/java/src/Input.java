import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        
        a=input.nextInt();
        b=input.nextInt();
        c=(a+b);
        System.out.println("Enter Number 1 :-"+a);
        System.out.println("Enter Number 2 :-"+b);
        System.out.println("Sum of both numbers :- "+c);
    }
}
