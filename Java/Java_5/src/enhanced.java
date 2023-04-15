public class enhanced {
    public static void main(String[] args) {
        int a[][]={
                {1,21,32,43,54},
                {1,3,423,23,54,3,23456,54,3,2},
                {1,2,13,3,2,12,3,24223,3,4,2,},
        };
        for (int l[] : a)
        {
            for (int k : l)
            {
                System.out.print(" "+k);
            }
            System.out.println("");
        }
    }
}
