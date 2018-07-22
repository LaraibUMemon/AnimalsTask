package com.qiagen.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {

    public static List<String> readFile(String filePath) throws FileNotFoundException {
        Scanner s = new Scanner(new File(filePath));
        ArrayList<String> list = new ArrayList<String>();
        while (s.hasNextLine()){
            list.add(s.nextLine());
        }
        s.close();
        return list;
    }
}
