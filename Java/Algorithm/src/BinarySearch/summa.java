package BinarySearch;

public class summa{
    public static int sqrt(int x){
        int i = 1;
        int count = 0;
        while(x>1){
            x-=i;
            if(x!=0){
                i+=2;
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(sqrt(4));
        
    }
}