package MultiThreads.question1;

/**
 * Develop and test a program that creates three tasks and three threads to run
 * them.
 * (i) The first task prints the letter a 100 times.
 * (ii) The second task prints the letter b 100 times.
 * (iii) The third task prints the integers 1 through 100.
 */

public class ThreeThreads {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadA());
        Thread thread2 = new Thread(new ThreadB());
        Thread thread3 = new Thread(new ThreadInt());

        thread1.start();
        thread2.start();
        thread3.start();

    }

    static class ThreadA implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println("a");
            }
        }

    }

    static class ThreadB implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println("b");
            }
        }

    }

    static class ThreadInt implements Runnable {

        @Override
        public void run() {
            for (int i = 1; i <= 100; i++) {
                System.out.println(i + " ");
            }
        }

    }

}
