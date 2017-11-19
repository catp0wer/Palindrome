package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String word = "CWVIC";
        System.out.println("The word is " + word);
        char[] arrayFromWord = word.toCharArray();
        System.out.println("The array from String is: " + Arrays.toString(arrayFromWord));

        boolean isPalindrom = true;
        for (int i = 0; i < arrayFromWord.length; i++) {
            if (arrayFromWord[i] == arrayFromWord[arrayFromWord.length - i - 1]) {
                System.out.println("Compare " + arrayFromWord[i] + " with " + arrayFromWord[arrayFromWord.length - i - 1]);
            }

            else{
                isPalindrom=false;
                System.out.println("Elementul " +arrayFromWord[arrayFromWord.length-i-1]+" nu este egal cu elementul " +arrayFromWord[i] );
               break;

            }
        }
    }
}

