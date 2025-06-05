public class Multithreading4 {

    public static class myThread extends Thread {
        public void run() {
            for (int i = 1; i <= 3; i++) {
                System.out.println(getName() + "is running with priority" + getPriority());
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("idher dekhoo");
        Thread t1 = new myThread();
        Thread t2 = new myThread();

        t1.setName("Low priority thread ");
        t2.setName("High priority thread ");

        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.MAX_PRIORITY); // 10

        t1.start();
        t2.start();
    }
}
