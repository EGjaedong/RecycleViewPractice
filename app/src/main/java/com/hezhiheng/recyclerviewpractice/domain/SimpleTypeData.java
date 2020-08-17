package com.hezhiheng.recyclerviewpractice.domain;

import java.util.ArrayList;
import java.util.List;

public class SimpleTypeData {
    public String title;
    public String description;
    public int number;

    public SimpleTypeData(String title, String description, int number) {
        this.title = title;
        this.description = description;
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static int lastDataNumber = 0;

    public static List<SimpleTypeData> createSimpleTypeDataList(int dataCount) {
        List<SimpleTypeData> simpleTypeDataList = new ArrayList<>();
        for (int i = 0; i < dataCount; i++) {
            simpleTypeDataList.add(new SimpleTypeData("Title" + (++lastDataNumber), "Description"
                    + lastDataNumber, lastDataNumber));
        }
        return simpleTypeDataList;
    }
}
