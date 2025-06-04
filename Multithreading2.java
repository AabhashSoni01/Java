class DownloadFile implements Runnable {
    private String file;

    public DownloadFile(String file) {
        this.file = file;
    }

    public void run() {
        for (int i = 0; i <= 5; i++) {
            try {
                Thread.sleep(2000); // Simulate delay
            } catch (Exception e) {

            }
            System.out.println(file + " downloading... " + (i * 20) + "%");
        }

        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }

        System.out.println(file + " done!");
    }
}

public class Multithreading2 {
    public static void main(String[] args) {
        DownloadFile fileA = new DownloadFile("File A");
        DownloadFile fileB = new DownloadFile("File B");

        Thread t1 = new Thread(fileA);
        Thread t2 = new Thread(fileB);

        t1.start();
        t2.start();
    }
}
