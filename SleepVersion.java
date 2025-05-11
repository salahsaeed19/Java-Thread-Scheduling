public class SleepVersion {

    static class NumberPrinter implements Runnable {
        public void run() {
            for (int i = 1; i <= 100; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    e.printStackTrace();
                }
            }
        }
    }

    static class LetterPrinter implements Runnable {
        public void run() {
            for (char c = 'a'; c <= 'z'; c++) {
                System.out.println(Thread.currentThread().getName() + ": " + c);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    e.printStackTrace();
                }
            }
            for (char c = 'A'; c <= 'Z'; c++) {
                System.out.println(Thread.currentThread().getName() + ": " + c);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread numberThread = new Thread(new NumberPrinter(), "NumberThread");
        Thread letterThread = new Thread(new LetterPrinter(), "LetterThread");

        numberThread.start();
        letterThread.start();
    }
}