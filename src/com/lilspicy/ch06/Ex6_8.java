package com.lilspicy.ch06;

class Data3 {
    int x;
}

public class Ex6_8 {
    public static void main(String[] args) {
        Data3 d = new Data3();
        d.x = 10;

        Data3 d2 = copy(d);
        System.out.println("d.x =" + d.x);
        System.out.println("d2.x =" + d2.x);
    }

    static Data3 copy(Data3 data3) {
        Data3 tmp = new Data3();
        tmp.x = data3.x;
        return tmp;
    }
}
