package com.nayan.demos.structural.proxy;

import java.util.HashMap;

public class PinterestDownloader {

    private Pinterest api;

    public PinterestDownloader(Pinterest api) {
        this.api = api;
    }

    public void renderIdeaPage(String id) {
        Idea idea = api.getIdea(id);
        System.out.println("\n-------------------------------");
        System.out.println("ID: " + idea.getId());
        System.out.println("Title: " + idea.getTitle());
        System.out.println("Data: " + idea.getData());
        System.out.println("-------------------------------\n");
    }

    public void renderPopularIdeas() {
        HashMap<String, Idea> list = api.popularIdeas();
        System.out.println("\n-------------------------------");
        for (Idea idea : list.values()) {
            System.out.println("ID: " + idea.getId() + " / Title: " + idea.getTitle());
        }
        System.out.println("-------------------------------\n");
    }
}