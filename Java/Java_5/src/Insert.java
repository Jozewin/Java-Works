import java.util.Arrays;

public class Insert {
    public static void main(String[] args) {
        int [] a = {12,32,543,233,212,543,233,654,11};

        int index = 3;
        int value = 13243;
        System.out.println("BEfore insert :-"+ Arrays.toString(a));

        for ( int i = a.length-1;i>index ;i--)
        {
            a[i]=a[i-1];
        }
        a[index]=value;
        System.out.println("After insert :-"+ Arrays.toString(a));
    }
}
