package com.pattern.example.proxy.cacheproxy;

public interface ThirdPartyYoutubeLib 
{
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
