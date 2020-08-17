package com.hezhiheng.recyclerviewpractice.domain;

import java.util.ArrayList;
import java.util.List;

public class Data {
    public static final int TYPE_ITEM = 0;
    public static final int TYPE_HEADER = 1;

    public int type;
    public String title;
    public String description;
    public int number;
    public String avatar;

    public Data(int type, String title, String description, int number, int avatarSuffix) {
        this.title = title;
        this.description = description;
        this.number = number;
        this.type = type;
        this.avatar = "https://loremflickr.com/180/180?lock=" + avatarSuffix;
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

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public static int lastDataNumber = 0;

    public static List<Data> createMultiTypeDataList(int dataCount) {
        List<Data> dataList = new ArrayList<>();
        dataList.add(new Data(TYPE_HEADER, "This is header", null, lastDataNumber, lastDataNumber++));
        for (int i = 0; i < dataCount; i++) {
            dataList.add(new Data(TYPE_ITEM, "Title" + lastDataNumber, "Description" + lastDataNumber, lastDataNumber, lastDataNumber++));
        }
        lastDataNumber = 0;
        return dataList;
    }
}
