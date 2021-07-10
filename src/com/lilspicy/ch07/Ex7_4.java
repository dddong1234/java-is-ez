package com.lilspicy.ch07;

public class Ex7_4 {
    public static void main(String[] args) {
        Point p_1 = new Point(1, 2);
        Point p_2 = new Point3D(2, 3, 4);

        System.out.println(p_1.print());
        System.out.println(p_2.print());

    }

}

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String print() {
        return "x=" + this.x + ",y=" + this.y;
    }

}

class Point3D extends Point {
    int z;

    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    String print() {
        return "x=" + this.x + ",y=" + this.y + ",z=" + this.z;
    }
}