package Linked_List.linkedlist;

import java.util.Scanner;

import Linked_List.Linked_Lists;

public class Demo {
    public static void main(String[] args) {
        int choice;
        Linked_Lists<Integer> list = new Linked_Lists<>();

        Scanner in = new Scanner(System.in);
        
      while(true){
        System.out.println("\n_______________________________________\n");
        System.out.println("1. Insert at Beginning (give a data)");
        System.out.println("2. Display");
        System.out.println("3. Insert at a specific position (data and position) 0 to n ");
        System.out.println("4. Delete at position (position) 0 to n ");
        System.out.println("5. Get value");
        System.out.println("6. Update value(position and data)");
        System.out.println("7. Delete at end");
        System.out.println("8. Insert at end");
        System.out.println("9. Search value and get the index");
        System.out.println("10. Does LL contains the value ");
        System.out.println("11. Length of the LinkedList ");
        System.out.println("12. Reverse the existing linked list");
        System.out.println("13. To Exit");
        System.out.println("\n_______________________________________\n");
        System.out.println("Enter the choice");
        choice = in.nextInt();
        switch(choice)
        {
            case 1:
            {
                System.out.println("Enter a data :- ");
                int val = in.nextInt();
                list.insertAtBeginning(val);
                break;
            }
            case 2:
            {
                list.display();
                break;
            }
            case 3:
            {
                System.out.println("Enter position :- ");
                int pos = in.nextInt();
                System.out.println("data");
                int val = in.nextInt();
                list.insertAtPosition(pos,val);
                break;
            }
            case 4:
            {
                System.out.println("Enter position :- ");
                int pos = in.nextInt();
                list.deleteAtPosition(pos);
                break;
            }
            case 5:
            {
                System.out.println("Enter position :- ");
                int pos = in.nextInt();
                System.out.println(list.getValue(pos)); 
                break;
            }
            case 6:
            {
                System.out.println("Enter position :- ");
                int pos = in.nextInt();
                System.out.println("Enter data :- ");
                int val = in.nextInt();
                list.toUpdate(pos, val);
                break;
            }
            case 7:
            {
                list.deleteAtEnd();
                break;
            }
            case 8:
            { System.out.println("Enter data :- ");
            int val = in.nextInt();
                list.insertAtEnd(val);
                break;
            }
            case 9:
            {
                System.out.println("Enter data :- ");
                int val = in.nextInt();
                list.search(val);
                break;
            }
            case 10:
            {
                System.out.println("Enter data :- ");
                int val = in.nextInt();
                System.out.println(list.contains(val));
                break;
            }
            case 11:
            {
                System.out.println(list.length()); 
                break;
            }
            case 12:
            {
                list.reverse();
                break;
            }
            case 13:
            {
                System.exit(0);
            }
            default:
            {
                System.out.println("Enter a valid number....");
            }
        }
    }
}}