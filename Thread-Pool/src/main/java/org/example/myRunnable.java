package org.example;


public class myRunnable implements Runnable{
    public String name;

    public myRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Start Thread : "+ name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End Thread : "+ name);
    }
}