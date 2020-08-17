package com.hezhiheng.recyclerviewpractice.domain;

import java.util.ArrayList;
import java.util.List;

public class MultiTypeData extends SimpleTypeData {
    public static final int TYPE_ITEM = 0;
    public static final int TYPE_HEADER = 1;

    public int type;

    public MultiTypeData(int type, String title, String desc, int number) {
        super(title, desc, number);
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public static List<MultiTypeData> createMultiTypeDataList(int dataCount) {
        List<MultiTypeData> multiTypeDataList = new ArrayList<>();
        multiTypeDataList.add(new MultiTypeData(TYPE_HEADER, "This is header", null, lastDataNumber++));
        for (int i = 0; i < dataCount; i++) {
            multiTypeDataList.add(new MultiTypeData(TYPE_ITEM, "Title" + lastDataNumber, "Description" + lastDataNumber, lastDataNumber++));
        }
        return multiTypeDataList;
    }
}
