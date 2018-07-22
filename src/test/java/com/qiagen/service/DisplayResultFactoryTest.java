package com.qiagen.service;

import com.qiagen.categories.DisplayCategory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class DisplayResultFactoryTest {
    List<String> lines =  new ArrayList<>();
    @Before
    public void setUp() {
        lines.add("ANIMALS");
        lines.add("cow");
        lines.add("NUMBERS");
        lines.add("one");
        lines.add("CARS");
        lines.add("bmw");
        lines.add("ANIMALS");
        lines.add("sheep");
        lines.add("moose");
        lines.add("NUMBERS");
        lines.add("one");
        lines.add("five");
        lines.add("CARS");
        lines.add("BMW");


    }


    @Test
    public void createCategoryList() {
        DisplayResultFactory factory = new DisplayResultFactory(lines);
        Map<DisplayCategory, List<String>> map = factory.getCategoryItems();
        Assert.assertEquals(map.size(),3);
        Assert.assertEquals(map.get(DisplayCategory.ANIMALS).size(),3);
        Assert.assertEquals(map.get(DisplayCategory.NUMBERS).size(),3);
        Assert.assertEquals(map.get(DisplayCategory.CARS).size(),2);
    }


}