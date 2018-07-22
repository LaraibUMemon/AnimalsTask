package com.qiagen.service.impl;

import com.qiagen.categories.DisplayCategory;
import com.qiagen.service.DisplayResult;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountUniqueDisplay implements DisplayResult {


    DisplayCategory itemCategory;
    private List<String> items;

    public CountUniqueDisplay(List<String> items, DisplayCategory category) {
        this.itemCategory = category;
        this.items = items;
    }

    @Override
    public void displayResult() {
        if (items != null) {
            Map<String, Integer> valueMap = new HashMap<>();
            items.forEach((v) -> {
                valueMap.merge(v, 1, Integer::sum);
            });
            System.out.println(itemCategory + ":");
            valueMap.forEach((k, v) -> {
                System.out.println(k + " : " + v);

            });
        }
    }
}
