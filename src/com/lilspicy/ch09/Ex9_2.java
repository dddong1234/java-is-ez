package com.lilspicy.ch09;

class Person {
    long id;

    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            return id == ((Person) obj).id;
        } else {
            return false;
        }
    }

    Person(long id) {
        this.id = id;
    }
}

public class Ex9_2 {
    public static void main(String[] args) {
        Person p1 = new Person(1234567890L);
        Person p2 = new Person(1234567890L);

        if (p1.equals(p2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
