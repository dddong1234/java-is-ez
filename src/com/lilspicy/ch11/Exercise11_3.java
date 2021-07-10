package com.lilspicy.ch11;

import java.util.*;

class Student implements Comparable {
    String name;
    int ban;
    int no;
    int kor, eng, math;

    Student(String name) {
        this.name =name;
    }

    Student(String name, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage() {
        return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
    }

    public String toString() {
        return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Student) {
            Student temp = (Student) o;
            return this.name.compareTo(temp.name);
        }
        return 0;
    }
}

public class Exercise11_3 {
    public static void main(String[] args) {
        Student s1 = new Student("b");
        Student s2 = new Student("a");

        List ss = new ArrayList<>();
        ss.add(s1);
        ss.add(s2);

        Collections.sort(ss);

        for (Object s : ss) {
            System.out.println(s);
        }
    }
}
