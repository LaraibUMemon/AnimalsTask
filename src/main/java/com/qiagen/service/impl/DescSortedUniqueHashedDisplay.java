package com.qiagen.service.impl;

import com.qiagen.categories.DisplayCategory;
import com.qiagen.service.DisplayResult;
import org.apache.commons.codec.digest.DigestUtils;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class DescSortedUniqueHashedDisplay implements DisplayResult {


    DisplayCategory itemCategory;
    private List<String> items;

    public DescSortedUniqueHashedDisplay(List<String> items, DisplayCategory category) {
        this.itemCategory = category;
        this.items = items;
    }

    @Override
    public void displayResult() {
        if (items != null) {
            items =  items.stream()
                    .map(String::toLowerCase)
                    .collect(Collectors.toList());
            TreeSet<String> sorted = new TreeSet<String>(Collections.reverseOrder());
            sorted.addAll(items);
            System.out.println(itemCategory+":");
            sorted.forEach((v) -> System.out.println(v.toLowerCase() + " (" + DigestUtils.md5Hex(v) + ")"));
        }
    }
}
