package com.lilspicy.ch14;

import java.util.Scanner;

public class 무조건지는가위바위보 { public static void main(String[] args) {
    String Com ;
    String User;

    Scanner s = new Scanner(System.in);
    System.out.print("가위바위보 시작! >");
    User = s.nextLine();
    if (User.equals("가위")) {
        Com = "바위";
    } else if (User.equals("바위")) {
        Com = "보";
    } else if (User.equals("보")) {
        Com = "가위";
    } else {
        Com = null;
    }
    System.out.println("User = " + User);
    System.out.println("Com = "+Com);
    System.out.println("당신은 졌습니다 ㅋㅋ ㅄ");
}
}
