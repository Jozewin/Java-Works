public class Vowels {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("Yoo thala wat doin uh!!!! @ 12aM");
        // To calculate number of uppercase,lowercase,vowels,spaces,symbols

        int uppercase=0,lowercase=0,vowels=0,spaces=0,symbols=0,number=0;

        for (int i = 0;i<a.length();i++)
        {
            if (a.charAt(i)>=65 && a.charAt(i)<=90)
            {
                uppercase++;
            }

            if (a.charAt(i)>=97 && a.charAt(i)<=122)
            {
                lowercase++;
            }

            if (a.charAt(i)==32)
            {
                spaces++;
            }

            if (a.charAt(i)>=48 && a.charAt(i)<=57)
            {
                number++;
            }

            if (a.charAt(i)=='A' || a.charAt(i)=='E' || a.charAt(i)=='I' || a.charAt(i)=='O' || a.charAt(i)=='U' || a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u')
            {
                vowels++;
            }
        }
        System.out.println(a);
        System.out.println("Total length             - "+a.length());
        System.out.println("Number of UpperCases     - "+uppercase);
        System.out.println("Number of Lowercases     - "+lowercase);
        System.out.println("Number of Vowels         - "+vowels);
        System.out.println("Number of Spaces         - "+spaces);
        System.out.println("Number of numbers        - "+number);
        System.out.println("Number of Symbols        - "+(a.length()-(uppercase+lowercase+spaces+number)));
    }
}
