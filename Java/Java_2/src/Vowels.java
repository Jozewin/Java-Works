import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {

        /*

        To identify the vowels and consonants using switch function

        */
        char c;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Alphabet :- ");
        c = in.next().charAt(0);

        switch (c)

        {
            case 'a':
                System.out.println("The entered character is VOWELS");
                break;

            case 'e':
                System.out.println("The entered character is VOWELS");
                break;

            case 'i':
                System.out.println("The entered character is VOWELS");
                break;

            case 'o':
                System.out.println("The entered character is VOWELS");
                break;

            case 'u':
                System.out.println("The entered character is VOWELS");
                break;

            case 'A':
                System.out.println("The entered character is VOWELS");
                break;

            case 'E':
                System.out.println("The entered character is VOWELS");
                break;

            case 'I':
                System.out.println("The entered character is VOWELS");
                break;

            case 'O':
                System.out.println("The entered character is VOWELS");
                break;

            case 'U':
                System.out.println("The entered character is VOWELS");
                break;

            default:
                System.out.println("The entered character is CONSONANT");
                break;

        }
    }
}
