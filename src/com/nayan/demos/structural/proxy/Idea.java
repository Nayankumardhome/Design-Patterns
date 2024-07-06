package com.nayan.demos.structural.proxy;

public abstract class Idea {
    private String id;
    private String title;

    public Idea(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public abstract String getData();
}
