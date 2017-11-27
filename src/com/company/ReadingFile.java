package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

    public class ReadingFile {

        public String ReadFile() {

            System.out.println("Reading File from Java code");
            String fileName = "D:\\Git_projects\\Palindrome\\Words.txt";
            String line = "";

            try {
                FileReader inputFile = new FileReader(fileName);
                BufferedReader bufferReader = new BufferedReader(inputFile);


                while ((line=bufferReader.readLine())!= null) {

                    System.out.println(line);

                }
                bufferReader.close();
            } catch (Exception e) {
                System.out.println("Error while reading file line by line:" + e.getMessage());
            }
            return line;  //?????
        }}


