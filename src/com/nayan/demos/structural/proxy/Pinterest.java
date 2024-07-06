package com.nayan.demos.structural.proxy;

import java.util.HashMap;

public interface Pinterest {
    HashMap<String, Idea> popularIdeas();
    Idea getIdea(String ideaId);
}
