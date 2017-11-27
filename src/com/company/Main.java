package com.company;
import com.company.ReadingFile;

import java.io.IOException;
import java.io.FileReader;
import java.util.Arrays;
import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "D:\\Git_projects\\Palindrome\\Words.txt";
        ReadingFile words = new ReadingFile();

        List<String> result = words.ReadFile(filePath);
        System.out.println(result);

        Comparing word = new Comparing();

        for (int i = 0; i < result.size(); i++) {
         word.Comp(result.get(i).toLowerCase());
       }
    }
}