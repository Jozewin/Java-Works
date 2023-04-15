import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
         // Quadratic equation

        Scanner in = new Scanner(System.in);
         Double a= in.nextDouble();
        Double b= in.nextDouble();
        Double c= in.nextDouble();

         double d = (b*b)-4.0*a*c;

         if(d<0.0)
         {
             double r1 = (-b+ Math.pow(d,0.5))/(2.0*a);
             double r2 = (-b- Math.pow(d,0.5))/(2.0*a);
             System.out.println("The Root using Positive is "+r1+"\nThe Root using Negative is "+r2);

         }
         else if (d==0.0)
         {
             double r3 = -b/2.0*a;
             System.out.println("The Root is "+r3);

         }else {
             System.out.println("The Roots are not real");
         }



/*    System.out.println("Program to Print Group");
      for (int i =1;i<= 4;i++)
      {
          System.out.println("Group "+i+":");
          for (int j =100+i;j<=120;j=j+4)
          {
              System.out.println(j);
          }
          System.out.println();
      }

     */
        /* Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int sum = 1;
        for (int i = 1; i<=n;i++)
        {
            sum = sum*i;
        }
        System.out.println(sum);

        */
        /* Scanner in = new Scanner(System.in);
        System.out.println("Enter the limit :- ");
        int n = in.nextInt();

        int sum = 0;
        for (int i = 1; i<=n;i++)
        {
            System.out.println("Enter number "+i+" :- ");
            int s = in.nextInt();
            sum+=s;
        }
        System.out.println("Sum of "+n + " numbers is "+sum);
        System.out.println("Average of"+n + " number is "+sum/n);

        */
    }
}
