package com.prodsum;

public class BeerWare {
    private static int counterBeer = 0;

    public synchronized static void addBeer(int count){
        counterBeer +=count;
    }

    public static void printBeerCount() {
        System.out.println("Количество пива: " + counterBeer);
    }
}
