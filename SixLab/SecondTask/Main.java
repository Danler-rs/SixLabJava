package SixLab.SecondTask;

import SixLab.FirstTask.MyFirstThread;

public class Main {
    public static void main(String[] args) throws InterruptedException{

        for (int i =0; i < 10; i++){
            MyThread myThread = new MyThread();
            myThread.start();
            myThread.join();

        }
        System.out.println("End!");
    }
}
