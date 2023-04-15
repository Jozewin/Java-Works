package DoublyLinked;

public class Demo {
    public static void main(String[] args) {
        Doublylinkedlist list = new Doublylinkedlist();
        //Insert at beginning testing
      /*   list.insertAtBeginning(12);
        list.insertAtBeginning(2);
        list.insertAtBeginning(29);
        list.insertAtBeginning(7);

        // Displaying testing
        list.display();
        System.out.println(" ");
        list.displayRev();                                      
        System.out.println(" ");*/

        // Insert at any position testing
        list.insertAtEnd(11);
        list.display();
        System.out.println(" ");
        list.displayRev();
        System.out.println(" ");        
        
        System.out.println(list.contains(11));

        System.out.println(" ");
        System.out.println(list.length());

    }
}
