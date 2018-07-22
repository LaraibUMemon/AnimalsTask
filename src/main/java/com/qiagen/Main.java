package com.qiagen;

import com.qiagen.service.DisplayResultFactory;
import com.qiagen.util.FileReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String inputFile ="src/main/resources/input2.txt";
        try {
            List<String> lines = FileReader.readFile(inputFile);
            DisplayResultFactory factory = new DisplayResultFactory(lines);
            factory.displayAll();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
