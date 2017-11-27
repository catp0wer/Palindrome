package com.company;
import com.company.ReadingFile;

import java.io.IOException;
import java.io.FileReader;
import java.util.Arrays;
import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ReadingFile word = new ReadingFile();

        List<String> result = word.ReadFile();
    }
}