package com.prodsum;

import java.util.concurrent.Semaphore;

public class Summator implements Runnable{
    private final int a;
    private final int b;
    private final int c;
    private final Semaphore semaphore;

    public Summator(int a, int b, int c, Semaphore semaphore) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.semaphore = semaphore;
    }

    public void addProdukt () {
               BreadWare.addBread(a);
               MilkWare.addMilk(b);
               BeerWare.addBeer(c);
    }

    @Override
    public void run() {
        addProdukt();
        semaphore.release();
    }
}
