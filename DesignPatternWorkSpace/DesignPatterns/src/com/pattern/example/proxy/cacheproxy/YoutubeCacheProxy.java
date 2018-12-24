package com.pattern.example.proxy.cacheproxy;

import java.util.HashMap;

public class YoutubeCacheProxy implements ThirdPartyYoutubeLib 
{
    private ThirdPartyYoutubeLib youtubeService;  // original object is here
    private HashMap<String, Video> cacheAll = new HashMap<String, Video>();

    public YoutubeCacheProxy() {
        this.youtubeService = new ThirdPartyYoutubeClass();
    }

    @Override
    public Video getVideo(String videoId) 
    {
        Video video = cacheAll.get(videoId);
        // if not found in the cache, use the original class object to retrive the video
        
        if (video == null) {
            video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        }
        return video;
    }

    public void reset() 
    {
        cacheAll.clear();
    }
}
