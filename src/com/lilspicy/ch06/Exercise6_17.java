package com.lilspicy.ch06;

public class Exercise6_17 {
     static int[] shuffle(int[] arr) {
        int tmp;
        for (int i = 0; i < arr.length * 5; i++) {
            int x = (int) (Math.random() * arr.length);
            tmp = arr[0];
            arr[0] = arr[x];
            arr[x] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));

    }
}
