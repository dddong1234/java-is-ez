package com.lilspicy.ch13;

public class Ex13_6 {
    public static void main(String[] args) {
        Thread6_1 th1 = new Thread6_1();
        Thread6_2 th2 = new Thread6_2();

        th2.setPriority(7);

        System.out.println("Priority of th1(-) : " + th1.getPriority());
        System.out.println("Priority of th2(|) : " + th2.getPriority());

        th1.start();
        th2.start();
    }
}

class Thread6_1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("-");
            for (int x = 0; x < 10000000; x++) {
            }
        }
    }
}

class Thread6_2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("|");
            for (int x = 0; x < 10000000; x++) {
            }
        }
    }
}
