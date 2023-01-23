package SixLab.FirstTask;

public class MyFirstThread extends Thread{
    public void run(){
        System.out.println("Im thread! My name is "+ getName());
    }
}
