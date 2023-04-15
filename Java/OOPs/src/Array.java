import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the limit :- ");
        int n = in.nextInt();
        Students[] o = new Students[n];
        for (int i = 0;i<o.length;i++)
        {
            o[i].age=in.nextInt();
            o[i].name=in.nextLine();
            o[i].print();

        }


    }
}

class Students
{
    public int age;
    public String name;

    public Students (int age,String name)
    {
        this.age = age;
        this.name = name;
    }

    public Students()
    {
        Scanner in = new Scanner(System.in);
        name = in.nextLine();
        age = in.nextInt();
    }


    void print ()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Name of the Student is "+name);
    //    String name = in.nextLine();
        System.out.println("Age of the Student "+name+" is "+age);
   //     int age = in.nextInt();
        System.out.println("_______________________________________________");
    }
}
