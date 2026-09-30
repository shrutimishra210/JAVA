class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running with Name: " + Thread.currentThread().getName());
        System.out.println("Thread priority:" + Thread.currentThread().getPriority());
    }
}

public class u4p3{
    public static void main(String[] args) {
        
        Thread MyThread = new Thread(new MyThread());
        MyThread.setName("Shruti");
        MyThread.setPriority(Thread.MAX_PRIORITY);

        MyThread.start();

        System.out.println("Main Thread Name:"+ Thread.currentThread().getName());
        System.out.println("Main Thread Priority:"+Thread.currentThread().getName());
    }
}