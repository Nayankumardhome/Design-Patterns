package com.nayan.demos.structural.proxy.Example1;

import java.util.HashMap;

public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib{

	@Override
	public HashMap<String, Video> popularVideos() {
		connectToServer("http://www.youtube.com");
        return getRandomVideos();
	}

	@Override
	public Video getVideo(String videoId) {
		connectToServer("http://www.youtube.com/" + videoId);
        return getSomeVideo(videoId);
	}
	
	//We are creating a fake simulation to connect Youtube Server
	
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
    
    private HashMap<String, Video> getRandomVideos() {
        System.out.print("Downloading populars... ");

        experienceNetworkLatency();
        HashMap<String, Video> hmap = new HashMap<String, Video>();
        hmap.put("sheild", new Video("Video1", "Shield.mp4"));
        hmap.put("painting", new Video("Video2", "Nature painting.mp4"));
        hmap.put("design patterns", new Video("Video3", "Design Patterns.mpq"));
        hmap.put("cricket", new Video("Video4", "ind vs sa.mov"));
        hmap.put("java", new Video("Video5", "Programing lesson#1.avi"));

        System.out.print("Done!" + "\n");
        return hmap;
    }

    private Video getSomeVideo(String videoId) {
        System.out.print("Downloading video... ");

        experienceNetworkLatency();
        Video video = new Video(videoId, "Some video title");

        System.out.print("Done!" + "\n");
        return video;
    }
}
