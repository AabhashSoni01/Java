class myThread extends Thread {
    public void run() {
        System.out.println("hello");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }
        System.out.println("hiii");
    }
}

public class Multithreading {

    public static void main(String[] args) {
        myThread t1 = new myThread();
        t1.start();
        // System.out.println("hii");
        for (int i = 0; i < 3; i++) {
            System.out.println("hey");
        }
    }
}