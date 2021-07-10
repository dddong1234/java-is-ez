package com.lilspicy.ch09;

import java.security.PublicKey;

public class Ex9_5 {
    public static void main(String[] args) {
        Card2 c1 = new Card2();
        Card2 c2 = new Card2("Heart", 10);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}

class Card2 {
    String kind;
    int num;

    Card2() {
        this("SPADE" ,1);
    }

    Card2(String kind, int num) {
        this.kind = kind;
        this.num = num;
    }

    public String toString() {
        return "Kind : " + kind + ",number : " + num;
    }
}
