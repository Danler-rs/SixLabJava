package SixLab.FirstTask;

import SixLab.FirstTask.MyFirstThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i =0; i < 10; i++){
            MyFirstThread thread = new MyFirstThread();
            thread.start();
            thread.join();
        }

        System.out.println("End!");
    }
}
