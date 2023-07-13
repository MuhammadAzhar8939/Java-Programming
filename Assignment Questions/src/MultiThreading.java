public class MultiThreading extends Thread {
    private String name;

    public MultiThreading(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Thread " + name + " is running.");
        // Add your logic for the thread here
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + name + ": " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread " + name + " is finished.");
    }


    public static void main(String[] args) {
        MultiThreading thread1 = new MultiThreading("Thread 1");
        MultiThreading thread2 = new MultiThreading("Thread 2");
        // Start the threads
        thread1.start();
        thread2.start();
        // Wait for threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All threads are finished.");
    }
}
