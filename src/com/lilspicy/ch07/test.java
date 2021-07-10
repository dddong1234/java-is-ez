package com.lilspicy.ch07;

public class test {

}
interface Movable {
    void move(int x, int y);
}

interface Attackable {
    void attack(Unit u);
}

class Fighter implements Movable, Attackable {
    @Override
    public void attack(Unit u) {

    }

    @Override
    public void move(int x, int y) {

    }
}
