class MyThread extends Thread {
    private String threadName;

    public MyThread(String name) {
        threadName = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(threadName + " is running: " + i);
           
        }
    }
}

public class Multi_Thread_Example {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");
        MyThread thread3 = new MyThread("Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread: " + i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
