package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadingFile {

    public List<String> ReadFile(String filePath) {

        System.out.println("Reading File from Java code");
        //String fileName = "D:\\Git_projects\\Palindrome\\Words.txt";
        String line = "";
        List<String> result = new ArrayList<String>();
        try {
            FileReader inputFile = new FileReader(filePath);
            BufferedReader bufferReader = new BufferedReader(inputFile);

            while ((line=bufferReader.readLine())!= null) {

                System.out.println(line);
                result.add(line);

            } System.out.println(result);
            bufferReader.close();

        } catch (Exception e) {
            System.out.println("Error while reading file line by line:" + e.getMessage());
        }
        return result;
    }
}
