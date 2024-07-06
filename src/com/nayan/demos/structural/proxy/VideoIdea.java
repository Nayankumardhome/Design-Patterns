package com.nayan.demos.structural.proxy;

public class VideoIdea extends Idea {

    public VideoIdea(String id, String title) {
        super(id, title);
    }

    @Override
    public String getData() {
        return "Video data";
    }
}