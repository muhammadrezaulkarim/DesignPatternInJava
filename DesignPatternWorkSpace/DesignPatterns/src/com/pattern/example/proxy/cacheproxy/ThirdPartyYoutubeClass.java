package com.pattern.example.proxy.cacheproxy;

import java.util.HashMap;

public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib {

    @Override
    public Video getVideo(String videoId) {
        connectToServer("http://www.youtube.com/" + videoId);
        return getSomeVideo(videoId);
    }

    private void connectToServer(String server) 
    {
        System.out.print("Connecting to " + server + "... ");
        Thread.sleep(30000) // mimic network latency. sleep for 30000 miliseconds
        System.out.print("Connected!" + "\n");
    }

}
