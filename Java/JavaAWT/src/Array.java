import java.util.*;

public class Array {
    public static void main(String[] args) {
      /*  ArrayList<String> o = new ArrayList<>();
        o.add("Water bottle");
        o.add("Bag");
        o.add("Towel");

        Collections.sort(o); // Sort the array
        System.out.println(o.size());

        System.out.println("Things needed for the tour are....");

        for (String e:o)
        {
            System.out.println(e);
        }

        o.set(0,"dood");
        System.out.println(o);
        o.remove(0);
        System.out.println(o);

       */

      /*  LinkedList<String> o = new LinkedList<>();
        o.add("Redmi");
        o.add("realme");
        System.out.println(o);
        o.addFirst("Samsung");
        o.addLast("Moto");
        System.out.println(o);

       */
// Key/Value
        HashMap<Integer,String> o = new HashMap<Integer,String>();

        o.put(1,"One");
        o.put(2,"Two");
        o.put(3,"Three");
        o.put(4,"Four");
        o.put(5,"Five");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(o.get(n));
    }
}
