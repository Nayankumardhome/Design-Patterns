package com.nayan.demos.structural.proxy;

import java.util.HashMap;

public class PinterestProxyClass implements Pinterest {

    private Pinterest pinterest;
    private HashMap<String, Idea> cachePopular = new HashMap<>();
    private HashMap<String, Idea> cacheAll = new HashMap<>();

    public PinterestProxyClass() {
        this.pinterest = new PinterestImplClass();
    }

    @Override
    public HashMap<String, Idea> popularIdeas() {
        if (cachePopular.isEmpty()) {
            cachePopular = pinterest.popularIdeas();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cachePopular;
    }

    @Override
    public Idea getIdea(String ideaId) {
        Idea idea = cacheAll.get(ideaId);
        if (idea == null) {
            idea = pinterest.getIdea(ideaId);
            cacheAll.put(ideaId, idea);
        } else {
            System.out.println("Retrieved idea '" + ideaId + "' from cache.");
        }
        return idea;
    }

    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }
}