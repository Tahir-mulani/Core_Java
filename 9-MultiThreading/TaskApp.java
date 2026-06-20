class Download extends Thread {
    public void run() {
        System.out.println("Downloading file...");
        System.out.println("Download Complete");
    }
}

public class TaskApp {
    public static void main(String[] args) throws Exception {

        Download d = new Download();

        d.start();
        d.join();   // wait until download finishes

        System.out.println("Opening file...");
    }
}