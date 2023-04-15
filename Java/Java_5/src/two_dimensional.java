import java.util.Arrays;

public class two_dimensional {
    public static void main(String[] args) {
        int a[][] = {
                {12,32,54},
                {54,12,43},
                {11,775,32}
        };

        for (int i = 0 ; i<3;i++)
        {
            for (int j= 0;j<3;j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println(" ");
        }

    }
}
