public class String_concepts {
    public static void main(String[] args) {
        // String concepts
// Reminder :- spaces inside the quotes are also considers as characters
        String a = "Josewin";
        String b = "Josewin";

        /*
        Java stores String literals as hashcode(values) [b.hashCode()]
        if we assign a same value to 2 diff string they will have same hashcode
        String Literals will save same values to existing variable instead of creating a new one
         */
        //Lets check them
        System.out.println("Hashcode for a -"+a.hashCode());
        System.out.println("Hashcode for b -"+b.hashCode());

        //To check they are equal or not [a.equals(b)]
        System.out.println("Equal or not -"+a.equals(b));

        // To check both are true or not by ignoring the cases(Caps)  [c.equalsIgnoreCase(d)]
        String c="Dog"; // Just for this function wont be using it in remaining programs dun worry lmao
        String d="dog";
        System.out.println("Equal or not by ignoring the cases -"+c.equalsIgnoreCase(d)); // :)

        // To find the length of the string [ a.length() ]
        System.out.println("Length of a -"+a.length());

        // To print a single character from the String [a.charAt(5)]    5 is index number
        System.out.println("Character of a at 5 -"+a.charAt(5));

        //To change the given string to Uppercase or Lowercase [a.toUpperCase()],[a.toLowerCase()]
        /*
        we know tht Strings are mutable so Java wont change the existing string to uppercase or lowercase
        instead of that Java takes  copy of it and will change to uppercase
        Dun worry I'll make sure show tht with hashcode
        */
        System.out.println("Upper case of a -"+a.toUpperCase());
        System.out.println("lower case of a -"+a.toLowerCase() );

        // To replace a word from the already existing String [a.replace("Jose","Joze")]
        System.out.println("To replace a word - "+a.replace("Jose","Joze"));

        // __________________________________________________________


        // To check tht the specific word contains in the String [a.contains("ose")]
        System.out.println("To check the 'ose' contain in the String a- "+a.contains("ose"));

        // __________________________________________________________


        // To check tht the String is empty or not  [a.isEmpty()]
        System.out.println("To  check String 'a' is empty or not -"+a.isEmpty());

        // __________________________________________________________


        //To check the String starts with ______ and ends with _______     ___=> our answer
        System.out.println("Starts with 'Jo' -"+a.startsWith("Jo"));
        System.out.println("Ends with 'win' -"+a.endsWith("win"));

        // __________________________________________________________


        //To print substring of a given string
        /*
        it is like taking a part of characters from a String
        */
        System.out.println("Substring -"+a.substring(4));
        // for beginning and ending
        System.out.println("Subbbbbbb -"+a.substring(0,4));  // Takes ending as n-1

        // __________________________________________________________


        // To print the existing array in character wise
        String e ="JOSEWIN";
        char[] ch =e.toCharArray();
        for (char bruh : ch)
        {
            System.out.print(bruh+"   ");
        }
        // __________________________________________________________


        // To trim Spaces from the string
        System.out.println(" ");
        String f = "      Computer  ";
        System.out.println("Trim - "+a.trim());

        // __________________________________________________________




    }
}
