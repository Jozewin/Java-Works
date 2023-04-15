import java.util.Scanner;

public class UF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        UN un = new UN(N);

        while(!in.hasNextInt())
        {
            int p = in.nextInt();
            int q = in.nextInt();
            if(!un.Connection(p,q))
            {
                un.Union(p,q);
                System.out.println(p + " " + q);          // and print connection
            }

        }
    }
}

class UN
{
    private int Id[];

    public UN(int N)
    {
        Id = new int[N];
        for(int i = 0;i<N;i++)
        {
            Id[i]= i;

        }
    }
    // Root

    private int root(int i)
    {
        while(i!=Id[i])
        {
            i = Id[i];

        }return i;
    }

    public boolean Connection (int p,int q)
    {
        return root(p)==root(q);

    }

    public void Union (int p, int q)
    {
        int i = root(p);
        int j = root(q);
        Id[i]=j;

    }




}
