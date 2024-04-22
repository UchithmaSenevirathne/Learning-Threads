package org.example;

class One implements Runnable{

    @Override
    public void run() {
        for (int i = 1 ; i <= 5 ; i++){
            System.out.println("thread one");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Two implements Runnable{

    @Override
    public void run() {
        for (int i = 1 ; i <= 5 ; i++){
            System.out.println("thread two");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Runnable one = new One();
        Runnable two = new Two();
        Thread thread1 = new Thread(one);
        Thread thread2 = new Thread(two);
        thread1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();
    }
}