package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {

    private int maxSize;
    private List<T> items;


    public FixedList(int maxSize) {
        this.items = new ArrayList<>();
        this.maxSize = maxSize;
    }

    public void add(T item) {
        if (this.items.size() + 1 > maxSize) {

        }else
            this.items.add(item);

    }

    public List<T> getItems() {
        return items;
    }

}