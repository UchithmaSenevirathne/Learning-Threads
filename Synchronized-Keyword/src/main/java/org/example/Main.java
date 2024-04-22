package org.example;

class Calculation {
    int num;
    public synchronized void increment(){
        num++;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Calculation c = new Calculation();
        Thread t1 = new Thread(() -> {
            for (int i = 1 ; i <= 1000 ; i++){
                 c.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1 ; i <= 1000 ; i++){
                c.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(c.num);
    }
}