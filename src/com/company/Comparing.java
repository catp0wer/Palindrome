package com.company;

import java.util.Arrays;

public class Comparing {

    public void Comp() {
        String word = "CIVIC";
        System.out.println("The word is " + word);
        char[] arrayFromWord = word.toCharArray();
        System.out.println("The array from String is: " + Arrays.toString(arrayFromWord));

        boolean isPalindrome = true;
        for (int i = 0; i < arrayFromWord.length / 2; i++) {
            if (arrayFromWord[i] == arrayFromWord[arrayFromWord.length - i - 1]) {
                System.out.println("Compare " + arrayFromWord[i] + " with " + arrayFromWord[arrayFromWord.length - i - 1]);
            } else {
                isPalindrome = false;
                System.out.println("The element " + arrayFromWord[arrayFromWord.length - i - 1] + " is not equal to " + arrayFromWord[i]);
                break;

            }
        }
        if (isPalindrome == true) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is not a palindrome");
        }
    }


}
