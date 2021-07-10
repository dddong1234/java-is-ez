package com.lilspicy.ch07;

class Outer_e {
    class Inner_e {
        int iv = 100;
    }

}

public class Exercise7_6 {
    public static void main(String[] args) {
        Outer_e o = new Outer_e();
        Outer_e.Inner_e i = o.new Inner_e();
        System.out.println(i.iv);

    }
}
