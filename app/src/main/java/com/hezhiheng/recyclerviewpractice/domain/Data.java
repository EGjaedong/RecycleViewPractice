package com.hezhiheng.recyclerviewpractice.domain;

import java.util.ArrayList;

public class Data {
    public String title;
    public String description;
    public int number;

    public Data(String title, String description, int number) {
        this.title = title;
        this.description = description;
        this.number = number;
    }

    public static int lastDataNumber = 0;

    public static ArrayList<Data> createDataList(int dataCount) {
        ArrayList<Data> dataList = new ArrayList<>();
        for (int i = 0; i < dataCount; i++) {
            dataList.add(new Data("title" + (++lastDataNumber), "desp" + lastDataNumber, lastDataNumber));
        }
        return dataList;
    }
}
