package MultiThreads.question2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Define a class that implements the Runnable interface using the following
 * specifications. The run
 * method should loop ten times through the following task actions of printing a
 * time stamp, followed by a
 * greeting and then wait for a second.
 */

public class GreetWithTimeStamp implements Runnable {
    static int waitSeconds = 1;

    public static void main(String[] args) {
        Thread thread = new Thread(new GreetWithTimeStamp());
        thread.start();
    }

    public void ShowTIme() {
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YY-MM-DD HH:MM:Ss");
        String cuurentTime = time.format(formatter);
        System.out.println(cuurentTime);
    }

    public void ShowGreet() {
        System.out.println("Hello this is a Greeting!!");
    }

    public void StopFor1Sec() {
        try {
            Thread.sleep(waitSeconds * 1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            ShowTIme();
            ShowGreet();
            StopFor1Sec();
        }

    }

}