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

public class CountUniqueDisplayTest {
    List<String> items =  new ArrayList<>();
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    @Before
    public void setUp() {
        items.add("one");
        items.add("one");
        items.add("five");

        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void displayResult() {
        DisplayResult numbersDisplay = new CountUniqueDisplay(items, DisplayCategory.NUMBERS);
        numbersDisplay.displayResult();
        assertEquals("NUMBERS:\r\none : 2\r\nfive : 1\r\n", outContent.toString());
    }
}