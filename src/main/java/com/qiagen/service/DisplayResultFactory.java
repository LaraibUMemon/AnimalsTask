package com.qiagen.service;

import com.qiagen.categories.DisplayCategory;
import com.qiagen.service.impl.CountUniqueDisplay;
import com.qiagen.service.impl.DescSortedUniqueHashedDisplay;
import com.qiagen.service.impl.SortedUniqueDisplay;

import java.util.*;

public class DisplayResultFactory {

    private List<DisplayResult> displayResultList = new ArrayList<>();


    private Map<DisplayCategory, List<String>> categoryItems = new HashMap<>();

    public DisplayResultFactory(List<String> lines) {
        createCategoryList(lines);
        displayResultList.add(new SortedUniqueDisplay(categoryItems.get(DisplayCategory.ANIMALS), DisplayCategory.ANIMALS));
        displayResultList.add(new DescSortedUniqueHashedDisplay(categoryItems.get(DisplayCategory.CARS), DisplayCategory.CARS));
        displayResultList.add(new CountUniqueDisplay(categoryItems.get(DisplayCategory.NUMBERS), DisplayCategory.NUMBERS));
    }

    public void createCategoryList(List<String> lines) {
        DisplayCategory currentCategory = null;
        for (String line : lines) {
            if (Arrays.stream(DisplayCategory.values()).anyMatch(e -> e.name().equalsIgnoreCase(line)))
                currentCategory = DisplayCategory.valueOf(line);
            else {
                if (categoryItems.get(currentCategory) == null) {
                    List<String> list = new ArrayList<>();
                    categoryItems.put(currentCategory, list);
                }
                categoryItems.get(currentCategory).add(line);
            }
        }
    }

    public void displayAll() {
        for (DisplayResult strategy : displayResultList) {
            strategy.displayResult();

        }
    }

    public Map<DisplayCategory, List<String>> getCategoryItems() {
        return categoryItems;
    }
}
