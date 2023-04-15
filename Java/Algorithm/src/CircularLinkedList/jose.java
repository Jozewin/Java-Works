package CircularLinkedList;

public class jose {
    public static void main(String[] args) {
        CircularLinkedList <Integer> clist= new CircularLinkedList<>();
        clist.insertAtBeginning(87);
       clist.insertAtEnd(12);
        clist.insertAtEnd(22);
      clist.insertAtEnd(11);
        clist.insertAtEnd(111);
        clist.display();
        System.out.println(" ");

   System.out.println(clist.last.data);

       clist.insertAfter(111, 69);
        clist.display();
        System.out.println(" ");
        System.out.println(clist.size());

        System.out.println(clist.contains(10000));
   





         

    }
}
