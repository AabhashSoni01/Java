class downloadFile extends Thread {
    private String file;

    public downloadFile(String file) {
        this.file = file;
    }

    public void run() {
        for (int i = 0; i <= 5; i++) {
            try {
                Thread.sleep(2000);
            } catch (Exception e) {

            }
            System.out.println(file + " downloading... " + (i * 20) + "%");
        }

        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }
        System.out.println("done !");
    }
}

public class Multithreading1 {
    public static void main(String[] args) {
        downloadFile obj1 = new downloadFile("File A ");
        downloadFile obj2 = new downloadFile("File B ");
        obj1.start();
        obj2.start();
    }
}