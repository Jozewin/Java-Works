import java.util.Scanner;

public class Construct {
    public static void main(String[] args) {
        Triangle o = new Triangle();
        System.out.println("Area of the Triangle is "+o.Area());
    }
}


class Triangle{
    // Area = 1/2*b*h

    // Getting informations

    int b,h;

    Triangle(){
    /*    b = 1234;
         h = 32;
    */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length :-");
        b = in.nextInt();
        System.out.println("Enter the width  :-");
        h = in.nextInt();
    }

    double Area(){
        double area = (b*h)*0.5;
        return area;
    }
}
