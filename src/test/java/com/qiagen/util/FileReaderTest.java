package com.qiagen.util;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.List;

import static org.junit.Assert.*;

public class FileReaderTest {

    @Test
    public void readFile() throws FileNotFoundException {
        String inputFile ="src/main/resources/input2.txt";
        List<String> lines = FileReader.readFile(inputFile);
        Assert.assertEquals(lines.size(),26);

    }
}