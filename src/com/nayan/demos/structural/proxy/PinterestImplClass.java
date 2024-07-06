package com.nayan.demos.structural.proxy;

import java.util.HashMap;

public class PinterestImplClass implements Pinterest {

    @Override
    public HashMap<String, Idea> popularIdeas() {
        connectToServer("http://www.pinterest.com");
        return getRandomIdeas();
    }

    @Override
    public Idea getIdea(String ideaId) {
        connectToServer("http://www.pinterest.com/" + ideaId);
        return getSomeIdea(ideaId);
    }
    
    private int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    private void experienceNetworkLatency() {
        int randomLatency = random(5, 10);
        for (int i = 0; i < randomLatency; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void connectToServer(String server) {
        System.out.print("Connecting to " + server + "... ");
        experienceNetworkLatency();
        System.out.print("Connected!" + "\n");
    }
    
    private HashMap<String, Idea> getRandomIdeas() {
        System.out.print("Downloading populars... ");
        experienceNetworkLatency();
        HashMap<String, Idea> hmap = new HashMap<>();
        hmap.put("image1", new ImageIdea("Idea1", "Sunset.jpg"));
        hmap.put("image2", new ImageIdea("Idea2", "Mountain.jpg"));
        hmap.put("video1", new VideoIdea("Idea3", "Cooking.mp4"));
        hmap.put("video2", new VideoIdea("Idea4", "Travel.mov"));
        System.out.print("Done!" + "\n");
        return hmap;
    }

    private Idea getSomeIdea(String ideaId) {
        System.out.print("Downloading idea... ");
        experienceNetworkLatency();
        Idea idea = new ImageIdea(ideaId, "Some image");
        System.out.print("Done!" + "\n");
        return idea;
    }
}