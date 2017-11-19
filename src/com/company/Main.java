package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String word = "CIVIC";
        System.out.println("The word is " + word);
        char[] arrayFromWord = word.toCharArray();
        System.out.println("The array from String is: " + Arrays.toString(arrayFromWord));

        for (int i = 0; i < arrayFromWord.length; i++) {
            if (arrayFromWord[i] == arrayFromWord[arrayFromWord.length - i - 1]) {
                System.out.println("Compare " + arrayFromWord[i] + " with " + arrayFromWord[arrayFromWord.length - i - 1]);
            }
        }
    }
}

