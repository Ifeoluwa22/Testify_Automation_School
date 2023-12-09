package com.testify;

public class task6 {
    public static void main(String[] args) {

        String Word = "DEMOCRACY";

        StringBuilder wordReverse = new StringBuilder();

        wordReverse.append(Word);

        wordReverse.reverse();

        System.out.println(wordReverse);

        System.out.println(wordReverse.substring(4,8));
    }
}