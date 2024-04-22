package org.example;

class MyThread extends Thread {
    public void run(){
        System.out.println("my first thread");
    }
}
public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}