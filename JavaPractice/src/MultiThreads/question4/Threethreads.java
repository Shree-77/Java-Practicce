package MultiThreads.question4;

import java.util.Random;
import java.util.Scanner;

/**
 * Develop a multi-threaded program involving three threads one
 * of which prints the message Hello World for one hundred times,
 * the second thread prints a user-specified substring from a user
 * input string and the third thread generates one hundred random
 * numbers and computes its sum and displays it. The program
 * execution should start with the first thread. The second thread
 * should wait until the first thread finishes and the third thread
 * should wait for the second thread to finish. The three threads
 * should execute in a loop for a user specified number of times.
 */

public class Threethreads {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String inpuString = in.nextLine();
        in.close();
        Thread t1 = new Thread(new ThreadOne());
        Thread t2 = new Thread(new ThreadTwo(inpuString));
        Thread t3 = new Thread(new ThreadThread());

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        t3.start();
        try {
            t3.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

}

class ThreadOne implements Runnable {

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello world");
        }
    }
}

class ThreadTwo implements Runnable {
    String Substring;

    ThreadTwo(String subString) {
        this.Substring = subString;
    }

    public void run() {
        System.out.println(Substring.substring(0, 5));
    }
}

class ThreadThread implements Runnable {

    public void run() {
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            int random_no = random.nextInt(100);
            sum += random_no;
        }
        System.out.println(sum);
    }
}
