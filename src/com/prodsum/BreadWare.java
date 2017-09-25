package com.prodsum;

public class BreadWare {
    private static int counterBread = 0;

    public synchronized static void addBread(int count){
        counterBread +=count;
    }

    public static void printBreadCount() {
        System.out.println("Количество хлеба: " + counterBread);
    }

}
