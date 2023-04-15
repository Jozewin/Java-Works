
import java.util.Scanner;

class DynamicArray {
    private int arr[];
    private int size, capacity;
    static final int IntialCapacity = 2;

    DynamicArray() {
        size = 0;
        arr = new int[IntialCapacity];
        capacity = IntialCapacity;

    }

    public void toAdd(int insert) {
        if (size == capacity)
            toExtend();
        arr[size++] = insert;
    }

    private void toExtend() {
        capacity *= 2;
        arr = java.util.Arrays.copyOf(arr, capacity);
    }

    public void toDisplay() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    public void insertAtPos(int pos, int value) {

        if (size == capacity)
            toExtend();

        for (int i = size - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = value;

        size++;

    }

    public void deleteAtPos(int pos) {
        for (int i = pos + 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        size--;

        if (capacity > IntialCapacity && capacity > 3 * size) {
            shrinkArray();
        }
    }

    private void shrinkArray() {
        capacity = capacity / 2;
        arr = java.util.Arrays.copyOf(arr, capacity);
    }

    public void deleteFirst() {
        System.out.println("The element " + arr[0] + " is deleted");
        for (int i = 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        size--;

        if (capacity > IntialCapacity && capacity > size * 3) {
            shrinkArray();
        }

    }

    public void deleteLast() {
        System.out.println("The last element " + arr[size - 1] + " is Deleted");
        size--;

        if (capacity > IntialCapacity && capacity > size * 3) {
            shrinkArray();
        }

    }

    public void insertFirst(int value) {
        if (size == capacity)
            toExtend();


        for (int i = size - 1; i >= 0; i--)
            arr[i + 1] = arr[i];

        arr[0] = value;
        size++;

    }

    public int getInfo(int index) {
        return arr[index];
    }




}

public class DyanmicArrayDemo {
    public static void main(String[] args) {

        int choice, insert, pos, value;
        DynamicArray list = new DynamicArray();

        while (true) {
            System.out.println("\n::---------------------------------::\n");
            System.out.println("1.Insert at end");
            System.out.println("2.Display from the list");
            System.out.println("3.Insert at specific position");
            System.out.println("4.delete from the specific position");
            System.out.println("5.Delete first element ");
            System.out.println("6.Delete last element  ");
            System.out.println("7.Insert at Beginning ");
            System.out.println("8.To Retrive info ");
            System.out.println("9.To check that the list contains this value ");
            System.out.println("10.Exit");
            System.out.println("\n::---------------------------------::");
            System.out.println("Enter Your choice :- \t");

            Scanner in = new Scanner(System.in);
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the data to insert at end :- ");
                    insert = in.nextInt();
                    list.toAdd(insert);
                    break;

                case 2:
                    System.out.println("These are the elements from the list....");
                    list.toDisplay();
                    break;

                case 3:
                    System.out.println("Enter the Position (0 to N ) :- ");
                    pos = in.nextInt();
                    System.out.println("Enter the value...");
                    value = in.nextInt();
                    list.insertAtPos(pos, value);
                    break;

                case 4:
                    System.out.println("Enter the Index number to delete it...");
                    pos = in.nextInt();
                    if (pos < 0) {
                        System.out.println("Invalid Input...");
                        break;
                    }
                    list.deleteAtPos(pos);
                    break;

                case 5: {
                    list.deleteFirst();
                    break;
                }
                case 6: {
                    list.deleteLast();
                    break;
                }
                case 7: {
                    value = in.nextInt();
                    list.insertFirst(value);
                    break;
                }
                case 8: {
                    System.out.println("Enter the Index 0-N :- ");
                    int index = in.nextInt();
                    System.out.println(list.getInfo(index));
                    break;
                }

                case 10:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Enter the valid input...");

            }

        }
    }

}
