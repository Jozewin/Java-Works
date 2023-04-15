public class StringBuffer_StringBuilder {
    public static void main(String[] args) {

        // StringBuffer,StringBuilder Both are same

        StringBuffer a = new StringBuffer("Good Morning!!!");

        // To add a string at the end use Append function [a.append(" Josewin")]
        System.out.println(a.append(" Josewin"));

        // To insert a String in between use [a.insert(0,"Ohayo ")]
        System.out.println(a.insert(0,"Ohayo ")); // Ohayo Good Morning!!! Josewin

        // To replace a set of words use [a.replace(n,n,"//word")]
        System.out.println(a.replace(0,5,"@@@"));

        // To Delete a set of words use [a.delete(n,n-1)]
        System.out.println(a.delete(0,4));

        // To Reverse the whole String
        System.out.println(a.reverse()); //niwesoJ !!!gninroM dooG

        // To print a single character from the String
        System.out.println(a.charAt(0));

        // To find the length of the String
        System.out.println(a.length());

        // To find the subString [a.substring(n,n-1)]
        System.out.println(a.substring(0,7));

        //To change a character at specific Spot
        a.setCharAt(0,'N');
        System.out.println(a);
    }
}
