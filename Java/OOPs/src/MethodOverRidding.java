public class MethodOverRidding {
    public static void main(String[] args) {
        Programmer o = new Programmer(23,"Josewin","Front end");
        o.Details();

    }
}

class user
{
    public int age;
    String name;

    user (int a , String n)
    {
        this.name=n;
        this.age=a;
    }

    public void Details ()
    {
        System.out.println("The user name is "+name);
        System.out.println("The user age is  "+age);
    }
}

class Programmer extends user
{
   String programmer;

   Programmer ( int a , String n,String p)
   {
       super (a,n);  // Using super conductor to access the old class
       this.programmer = p;
   }

   public void Details()
   {
       System.out.println("The user name is "+name);
       System.out.println("The user age is  "+age);
       System.out.println("The user doing is "+programmer);
   }
}