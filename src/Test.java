import java.lang.Runnable;
import java.lang.*;

public class Test {
    public static void main(String[] args) {
        Thread myThread = new Thread(new MyThread());
        myThread.start();

        Thread myThread2 = new Thread(new MyThread());
        myThread2.start();

    }
}

class MyThread implements Runnable{
    public void run() {
        for (int i = 0; i<500; i++){
            System.out.println("Ku Thread " + i);
        }
    }

}