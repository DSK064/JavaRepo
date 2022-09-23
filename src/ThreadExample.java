class MyThread1 extends Thread
{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId()+" thread is running");
    }
}
class  MyThread2 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId()+" Runnable interface thread is running");
    }
}
public class ThreadExample {
    public static void main(String[] args) {
        try {
            MyThread1 myThread = new MyThread1();
            myThread.start();
        }
        catch (Exception e)
        {
            System.out.println("Exception occurred!!"+e.getMessage());
        }

        for(int i = 0; i < 10; i++) {
            try {
                Thread thread = new Thread(new MyThread2());
                thread.start();
            } catch (Exception e) {
                System.out.println("Exception occurred!!" + e.getMessage());
            }
        }
    }
}
