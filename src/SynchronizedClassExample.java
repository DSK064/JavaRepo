class MessageClass
{
    public void send(String message)
    {
        System.out.println("sending the message: "+message);
        try
        {
            Thread.sleep(1000);
        }
        catch (Exception e)
        {
            System.out.println("Exception occurred!!");
        }
    }
}
class SubThread extends Thread{
    final private String message;
    MessageClass messageClass;

    public SubThread(String message, MessageClass messageClass) {
        this.message = message;
        this.messageClass = messageClass;
    }

    @Override
    public void run() {
        synchronized (messageClass)
        {
            messageClass.send(message);
        }
    }
}
public class SynchronizedClassExample {
    public static void main(String[] args) {
        MessageClass msgclass = new MessageClass();
        SubThread s1 = new SubThread("Iam sending thread one", msgclass);
        SubThread s2 = new SubThread("Iam sending thread two", msgclass);
        s1.start();
        s2.start();
        try {
            s1.join();
            s2.join();
        }
        catch (Exception e)
        {
            System.out.println("Exception occurred");
        }
    }
}
