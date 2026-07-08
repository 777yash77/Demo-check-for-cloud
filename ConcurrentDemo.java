class MyThread extends Thread {
    String name;

    MyThread(String name) {
        this.name = name;
    }

    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println(name + " : " + i);
            try {
                Thread.sleep(500);
            } catch(Exception e) {}
        }
    }
}

public class ConcurrentDemo {
    public static void main(String[] args) {

        MyThread t1 = new MyThread("Thread A");
        MyThread t2 = new MyThread("Thread B");

        t1.start();
        t2.start();
    }
}