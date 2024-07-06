package com.nayan.demos.structural.proxy.Example1;

public class MainApp {

	public static void main(String[] args) {
        YouTubeDownloader naiveDownloader = new YouTubeDownloader(new ThirdPartyYouTubeClass());
        YouTubeDownloader smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");

    }

    private static long test(YouTubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("design patterns");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("java");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("design patterns");
        downloader.renderVideoPage("someotherid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
    
    //We are creating a fake simulation to connect Youtube Server 
    //using Thread.sleep() method we delay a time like in real life actually connect time to the server
    
    /*
     * Proxy : 
     * 
     * 		         										   (contains)
     *            ThirdPartyYouTubeLib (interface)			----------------->         YouTubeDownloader
     *               		^
     *               		|															- ThirdPartyYouTubeLib api;
     *   ThirdPartyYouTubeClass, YouTubeCacheProxy
     */
    

}
