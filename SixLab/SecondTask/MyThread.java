package SixLab.SecondTask;

import SixLab.ThirdTask.Main;

import java.util.concurrent.TimeUnit;

public class MyThread extends Thread {

    public void run() {

        long startTime = System.currentTimeMillis();
        long startTimeInSec = (int) (startTime / 1000 % 60);
        long endTime;
        long endTimeInSec;
        for (int i = 7; i > 0; i--) {
            try {
                sleep(1000);
                endTime = System.currentTimeMillis();
                endTimeInSec = (int) (endTime / 1000 % 60);
                long duration = endTimeInSec - startTimeInSec;
                System.out.println("Я поток под именем " + getName() + ". С момента запуска прошло " + duration + " секунд");

            } catch (InterruptedException e) {
                System.out.println(getName() + " прервался");
            }
        }
    }
}
