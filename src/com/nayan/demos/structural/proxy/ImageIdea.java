package com.nayan.demos.structural.proxy;

public class ImageIdea extends Idea {

    public ImageIdea(String id, String title) {
        super(id, title);
    }

    @Override
    public String getData() {
        return "Image data";
    }
}