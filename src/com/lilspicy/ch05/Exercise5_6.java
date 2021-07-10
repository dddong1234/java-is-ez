package com.lilspicy.ch05;

import java.util.Scanner;

public class Exercise5_6 {
    public static void main(String[] args) {
        String[] words = {"television", "computer", "mouse", "phone"};
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            char[] question = words[i].toCharArray();
            char tmp = ' ';
            for (int j = 0; j < question.length; i++) {
                int a = (int) (Math.random() * question.length);
                tmp = question[0];
                question[0] = question[a];
                question[a] = tmp;

                System.out.printf("Q%d. %s의 정답을 입력하세요>", i + 1, new String(question));
                String answer = scanner.nextLine();

                if (words[i].equals(answer.trim())) {
                    System.out.printf("맞았습니다.%n%n");
                } else {
                    System.out.printf("틀렸습니다.%n%n");
                }
                break;
            }
        }

    }
}
