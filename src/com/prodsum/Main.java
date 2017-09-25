package com.prodsum;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1-20);
        for (int i = 0; i < 20; i++) {
            int rndA = new Random(50).nextInt();
            int rndB = new Random(50).nextInt();
            int rndC = new Random(50).nextInt();
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
