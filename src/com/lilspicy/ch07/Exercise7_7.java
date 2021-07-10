package com.lilspicy.ch07;

class Outer4 {
    static class Inner {
        int iv = 200;
    }
}

public class Exercise7_7 {
    public static void main(String[] args) {
        Outer4.Inner i = new Outer4.Inner();
        System.out.println(i.iv);

    }
}
