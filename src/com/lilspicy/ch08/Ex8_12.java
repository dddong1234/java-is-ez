package com.lilspicy.ch08;

public class Ex8_12 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main에서 예외가 catch 되었습니다.");
        }
    }

    static void method1() throws Exception{
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1에서 예외가 catch 되었습니다");
            throw e;
        }
    }
}
