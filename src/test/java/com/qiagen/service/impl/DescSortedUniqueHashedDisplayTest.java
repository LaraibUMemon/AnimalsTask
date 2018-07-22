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

public class DescSortedUniqueHashedDisplayTest {
    List<String> items =  new ArrayList<>();
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    @Before
    public void setUp() {
        items.add("AUDI");
        items.add("BMW");
        items.add("Audi");
        items.add("VW");
        items.add("OPEL");
        items.add("Opel");

        System.setOut(new PrintStream(outContent));
    }
    @After
    public void tearDown() {
        System.setOut(originalOut);
    }
    @Test
    public void displayResult() {
        DisplayResult numbersDisplay = new DescSortedUniqueHashedDisplay(items, DisplayCategory.CARS);
        numbersDisplay.displayResult();
        assertEquals("CARS:\r\nvw (7336a2c49b0045fa1340bf899f785e70)\r\n"+
                "opel (f65b7d39472c52142ea2f4ea5e115d59)\r\n"+
                "bmw (71913f59e458e026d6609cdb5a7cc53d)\r\n"+
                "audi (4d9fa555e7c23996e99f1fb0e286aea8)\r\n", outContent.toString());
    }
}