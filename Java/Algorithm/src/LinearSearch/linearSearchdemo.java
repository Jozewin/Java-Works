package LinearSearch;

import java.util.Arrays;

import javax.sound.sampled.Line;

public class linearSearchdemo {
    public static void main(String[] args) {
        int arr[] = {12,23,43,65,34,87,97,3};
       // int target = 543;

        System.out.println("The element found at index :- "+LinearSearch.find(arr,97));
        System.out.println("Does the element 65 exist in the array ? "+LinearSearch.contains(arr,65));

        String name = "Josewin";
        Character find = 'j';
        System.out.println("return the index of the given string contain 'J' is "+LinearSearch.find(name,find));
        System.out.println("return the index of the given string contain 'J' is "+LinearSearch.contains(name,find));


        int bru[][] = {
            {12,32,54,12},
            {1,2,4,5,2,76,4},
            {43,12,76}
        };
        int b = 100000;
        int result[] = LinearSearch.find(bru,b);
        System.out.println(Arrays.toString(result));

        int arm[] = {12132,2233,43,65,3421};
        System.out.println(LinearSearch.findMax(arm));
        System.out.println(LinearSearch.findMin(arm));

        String you = "atop";
        System.out.println(LinearSearch.numOfChar(you,'l'));
        System.out.println("______________________________-");
        System.out.println(LinearSearch.toCountElemInArray(arm));
    }
    
}
