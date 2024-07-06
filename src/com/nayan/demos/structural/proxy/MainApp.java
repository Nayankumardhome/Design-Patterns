package com.nayan.demos.structural.proxy;

public class MainApp {

    public static void main(String[] args) {
        PinterestDownloader naiveDownloader = new PinterestDownloader(new PinterestImplClass());
        PinterestDownloader smartDownloader = new PinterestDownloader(new PinterestProxyClass());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");
    }

    private static long test(PinterestDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularIdeas();
        downloader.renderIdeaPage("image1");
        downloader.renderPopularIdeas();
        downloader.renderIdeaPage("video1");
        // Users might visit the same page quite often.
        downloader.renderIdeaPage("image1");
        downloader.renderIdeaPage("someotherid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
        
      //We are creating a fake simulation to connect Pinterest Server 
        //using Thread.sleep() method we delay a time like in real life actually connect time to the server
        
        /*
         * Proxy : 
         * 
         * 		         										   (contains)
         *                  Pinterest (interface)			----------------->         PinterestDownloader
         *               		^
         *               		|												       - Pinterest api;
         *   PinterestImplClass, PinterestProxyClass
         */
        

    }
}