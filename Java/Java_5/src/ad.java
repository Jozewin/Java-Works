// import java.util.Scanner;

import java.util.Arrays;

public class ad {
    public static void main(String[] args) {
        // Arrange them in ascending order
        int [] a = new int[] {12,23,5432,121,543,654,1231,543,2};
        System.out.println("Before Sorting :-"+Arrays.toString(a));

        int temp ;
        for (int i = 0;i<a.length;i++)
        {
            for (int j = i+1 ;j<a.length;j++)
            {
                if (a[i]>a[j]) {
                    temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("After Sorting :-"+Arrays.toString(a));

    }
}
