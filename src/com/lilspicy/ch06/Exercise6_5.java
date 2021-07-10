package com.lilspicy.ch06;

class PlayingCard {
    int kind;   //iv
    int num;    //iv
    static int width;   //cv
    static int height;  //cv

    PlayingCard(int k, int n) {
        kind = k;       //k,n => lv
        num = n;
    }

    public static void main(String[] args) {
        PlayingCard card = new PlayingCard(1, 1);
    }
}
class Exercise6_5 {
}
