import java.util.LinkedList;
import java.util.Queue;

class Buffer {
    private final Queue<Integer> queue = new LinkedList<>();
    private final int CAPACITY = 5;

    public synchronized void produce(int value) throws InterruptedException {
        while (queue.size() == CAPACITY) {
            wait(); // wait if buffer is full
        }
        queue.offer(value);
        System.out.println("Produced: " + value);
        notify(); // notify consumer
    }

    public synchronized int consume() throws InterruptedException {
        while (queue.isEmpty()) {
            wait(); // wait if buffer is empty
        }
        int val = queue.poll();
        System.out.println("Consumed: " + val);
        notify(); // notify producer
        return val;
    }
}

class Producer extends Thread {
    private final Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        int value = 1;
        try {
            while (value <= 10) {
                buffer.produce(value++);
                Thread.sleep(500); // simulate delay
            }
        } catch (InterruptedException e) {
            System.out.println("Producer interrupted");
        }
    }
}

class Consumer extends Thread {
    private final Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            while (true) {
                buffer.consume();
                Thread.sleep(1500); // simulate delay
            }
        } catch (InterruptedException e) {
            System.out.println("Consumer interrupted");
        }
    }
}

public class Multithreading6 {
    public static void main(String[] args) {
        Buffer sharedBuffer = new Buffer();

        Producer producer = new Producer(sharedBuffer);
        Consumer consumer = new Consumer(sharedBuffer);

        producer.start();
        consumer.start();
    }
}
