package com.qiagen.service.impl;

import com.qiagen.categories.DisplayCategory;
import com.qiagen.service.DisplayResult;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SortedUniqueDisplayTest {
    List<String> items =  new ArrayList<>();
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    @Before
    public void setUp() {
        items.add("sheep");
        items.add("moose");
        items.add("sheep");
        items.add("horse");
        items.add("horse");
        items.add("cow");

        System.setOut(new PrintStream(outContent));
    }
    @After
    public void tearDown() {
        System.setOut(originalOut);
    }
    @Test
    public void displayResult() {
        DisplayResult numbersDisplay = new SortedUniqueDisplay(items, DisplayCategory.ANIMALS);
        numbersDisplay.displayResult();
        assertEquals("ANIMALS:\r\ncow\r\nhorse\r\nmoose\r\nsheep\r\n", outContent.toString());
    }
}





