package com.prodsum;

public class MilkWare {

    private static int counterMilk = 0;

    public synchronized static void addMilk(int count){
        counterMilk +=count;
    }

    public static void printMilkCount() {
        System.out.println("Количество молока: " + counterMilk);
    }
}
