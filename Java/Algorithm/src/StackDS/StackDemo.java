package StackDS;

public class StackDemo {
    public static void main(String[] args) {
        
        StackUsingArray Stack = new StackUsingArray();
        Stack.pushThis(12);
        Stack.pushThis(132);
        Stack.pushThis(112);
        Stack.pushThis(165);
        Stack.pushThis(155);
        Stack.pushThis(23332);
        Stack.display();
        System.out.println(' ');
        Stack.popNow();
        Stack.popNow();
        Stack.popNow();
        Stack.popNow();
        Stack.popNow();
        System.out.println(Stack.peekNow()); 
        Stack.display();

    }   
}
