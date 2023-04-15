import java.util.concurrent.ThreadLocalRandom;

public class Demo_Threads {
    public static void main(String[] args) throws InterruptedException {
        Runnable d = () -> {


                for (int i = 1; i<= 5; i++) {

                    System.out.println("Database is being updated");

                    try {Thread.sleep(2000);} catch (InterruptedException e) {}
                }

        };
        List l = new List();

        Thread t1 = new Thread(d);

        t1.start();

        l.start();


        l.join();
        System.out.println("Happa mudinchitu da saami");

    }
}



class List extends Thread
{
    public void run()
    {
        for (int i = 1;i<=5;i++) {
            System.out.println("Time over");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }

}