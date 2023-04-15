public class Break_Continue {
    public static void main(String[] args) {
        for (int i = 1;i<=10;i++)
        {
            if (i== 2)
                continue;
            System.out.println(i);
            if (i==6)
                break; // breaks the loop after the condition is met
        }
    }
}
