package com.example.soccerteammanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public abstract class Repository<T> {
    protected List<T> items;

    public Repository() {
        items = new ArrayList<>();
    }

    public List<T> getAll() {
        return new ArrayList<>(items);
    }

    public void add(T item) {
        items.add(item);
    }

    public List<T> filter(Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T item : items) {
            if (predicate.test(item)) {
                filteredList.add(item);
            }
        }
        return filteredList;
    }
} 