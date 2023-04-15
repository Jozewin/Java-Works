import java.util.Scanner;

class demo
{
    public static void main(String[] args)
    {


    }
}

class employee
{
    String name;
    int age;
    double salary;

    employee(String n, int a, double s)
    {
        name = n;
        age = a;
        salary = s;
    }

    void empDisplay ()
    {
        System.out.println("Name of the employee - "+name);
        System.out.println("Age of the employee  - "+age);
        System.out.println("Salary of employee   - "+salary);
    }
}

class owner extends employee
{
    int bonus;
    owner(String n, int a, double s,int pp) {
        super(n, a, s);
        bonus = pp;
    }
}