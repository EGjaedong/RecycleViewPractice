package com.hezhiheng.recyclerviewpractice.domain;

import java.util.ArrayList;
import java.util.List;

public class MultiTypeData {
    public static final int TYPE_ITEM = 0;
    public static final int TYPE_HEADER = 1;

    public int type;
    public String title;
    public String description;
    public int number;

    public MultiTypeData(int type, String title, String description, int number) {
        this.title = title;
        this.description = description;
        this.number = number;
        this.type = type;
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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public static int lastDataNumber = 0;

    public static List<MultiTypeData> createMultiTypeDataList(int dataCount) {
        List<MultiTypeData> multiTypeDataList = new ArrayList<>();
        multiTypeDataList.add(new MultiTypeData(TYPE_HEADER, "This is header", null, lastDataNumber++));
        for (int i = 0; i < dataCount; i++) {
            multiTypeDataList.add(new MultiTypeData(TYPE_ITEM, "Title" + lastDataNumber, "Description" + lastDataNumber, lastDataNumber++));
        }
        lastDataNumber = 0;
        return multiTypeDataList;
    }
}
