package com.lilspicy.ch11;

import java.util.*;

public class Ex11_8 {
    public static void main(String[] args) {
        Integer[] arr = {30, 50, 10, 40, 20};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, new DescComp());
        System.out.println(Arrays.toString(arr));

    }
}

class DescComp implements Comparator {
    public int compare(Object o1, Object o2) {
        if (!(o1 instanceof Comparable && o2 instanceof Comparable)) {
            return -1;
        }
        Integer i = (Integer) o1;
        Integer i2 = (Integer) o2;

        return i.compareTo(i2) * -1;
    }
}