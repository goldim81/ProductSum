package com.prodsum;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1-20);
        for (int i = 0; i < 20; i++) {
            int rndA = new Random().nextInt(50);
            int rndB = new Random().nextInt(50);
            int rndC = new Random().nextInt(50);
            new Thread(new Summator(rndA, rndB, rndC, semaphore)).start();
        }
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        BreadWare.printBreadCount();
        MilkWare.printMilkCount();
        BeerWare.printBeerCount();


    }
}
