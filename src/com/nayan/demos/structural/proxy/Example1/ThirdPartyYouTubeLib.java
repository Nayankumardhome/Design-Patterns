package com.nayan.demos.structural.proxy.Example1;

import java.util.HashMap;

public interface ThirdPartyYouTubeLib {

	HashMap<String, Video> popularVideos();
	Video getVideo(String videoId);
}
