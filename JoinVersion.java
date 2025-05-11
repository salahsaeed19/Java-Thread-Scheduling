public class JoinVersion {

    static class NumberPrinter implements Runnable {
        public void run() {
            for (int i = 1; i <= 100; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }

    static class LetterPrinter implements Runnable {
        public void run() {
            for (char c = 'a'; c <= 'z'; c++) {
                System.out.println(Thread.currentThread().getName() + ": " + c);
            }
            for (char c = 'A'; c <= 'Z'; c++) {
                System.out.println(Thread.currentThread().getName() + ": " + c);
            }
        }
    }

    public static void main(String[] args) {
        Thread numberThread = new Thread(new NumberPrinter(), "NumberThread");
        Thread letterThread = new Thread(new LetterPrinter(), "LetterThread");

        numberThread.start();
        try {
            numberThread.join(); // Wait for number thread to finish
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }

        letterThread.start();
    }
}