package com.lilspicy.ch08;

public class Ex8_9 {
    public static void main(String[] args) throws Exception{
        try {
            method1();
        } catch (Exception e) {
            System.out.println(1);
        }
    }
    static void method1() throws Exception {
        method2();
    }
    static void method2()throws Exception {
        throw new Exception();
    }

}
