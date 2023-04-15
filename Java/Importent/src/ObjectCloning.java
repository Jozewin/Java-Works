public class ObjectCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("Josewin",6,"Maths");
     //   Student s2 = (Student) s1.clone();

        Student s2 = (Student)s1.clone();
        s1.display();

        System.out.println("");
        s2.display();
    }
}

class Department
{
    String dname;
    int depId;

    Department(String dn,int d)
    {
        dn = dname;
        d = depId;
    }
}

class Student implements Cloneable
{
    String name;
    int Id;
    String Department;

    Student(String n,int i,String dep)
    {
        name = n;
        Id=i ;
        Department= dep ;
    }



    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    void display()
{
    System.out.println("Name - "+name+"\nId - "+Id+"\nDepartment - "+Department);
}
}
