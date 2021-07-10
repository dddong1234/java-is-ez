package com.lilspicy.ch07.practice;

class Outer {
    class Inner {
        int iv = 100;
    }
}

public class Exercise7_6 {
    public static void main(String[] args) {

        Outer oo = new Outer();
        Outer.Inner ii = oo.new Inner();
        System.out.println(ii.iv);

    }
}
