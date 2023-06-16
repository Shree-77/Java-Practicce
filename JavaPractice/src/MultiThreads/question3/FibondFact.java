package MultiThreads.question3;

/**
 * Develop and test a multithreaded program one of which should generate and
 * display Fibonacci
 * numbers and the other should compute factorial of a number. The first thread
 * should be suspended for
 * two seconds after printing every ten numbers.
 */

public class FibondFact implements Runnable {

    @Override
    public void run() {
        printFibo(50);

    }

    public int printFibo(int num) {
        if (num <= 1)
            return num;
        return printFibo(num - 1) + printFibo(num - 2);

    }

    public int printFact(int num) {
        if (num == 0)
            return 1;
        return num * num - 1;
    }

}
