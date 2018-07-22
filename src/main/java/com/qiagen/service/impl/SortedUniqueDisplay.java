package com.qiagen.service.impl;

import com.qiagen.categories.DisplayCategory;
import com.qiagen.service.DisplayResult;

import java.util.List;
import java.util.TreeSet;

public class SortedUniqueDisplay implements DisplayResult {


    DisplayCategory itemCategory;
    private List<String> items;

    public SortedUniqueDisplay(List<String> items, DisplayCategory category)
    {
        this.itemCategory = category;
        this.items = items;
    }

    @Override
    public void displayResult() {
        if (items != null) {
            TreeSet<String> sorted = new TreeSet<String>(items);
            System.out.println(itemCategory+":");
            sorted.forEach(System.out::println);
        }
    }
}
