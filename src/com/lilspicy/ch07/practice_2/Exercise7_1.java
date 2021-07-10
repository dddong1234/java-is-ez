package com.lilspicy.ch07.practice_2;

public class Exercise7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();
        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i]+",");
        }
        System.out.println();
        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i]+",");
        }
        System.out.println();

        System.out.println( deck.pick(0));
        System.out.println(deck.pick());

    }
}

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i = 0; i < cards.length; i++) {
            int num = i % 10 + 1;
            boolean isKwang = (i < 10 && (num == 1 || num == 3 || num == 8));
            cards[i] = new SutdaCard(num, isKwang);
        }
    }

    void shuffle() {
        SutdaCard tmp;
        for (int i = 0; i < cards.length; i++) {
            int j = (int) (Math.random() * cards.length);
            tmp = cards[0];
            cards[0] = cards[j];
            cards[j] = tmp;
        }
    }

    SutdaCard pick(int index) {
        return cards[index];
    }

    SutdaCard pick() {
        int j = (int) (Math.random() * cards.length);
        return cards[j];
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + (isKwang ? "k" : "");
    }

}