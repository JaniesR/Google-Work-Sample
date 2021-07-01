package com.google;

import java.util.ArrayList;

/** A class used to represent a Playlist */
class VideoPlaylist {
    private String Name;
    private ArrayList<Video> playList;

    public VideoPlaylist(String playListName) {
        Name = playListName.trim();
        playList = new ArrayList<>();
    }

    public String getName() { return Name; }

    public String getPlaylist() {
    String fullList = "";
    if (playList.isEmpty()) {
        return "No videos here yet";
    } else {
    for (Video vid : playList) {
        fullList = fullList + vid.getTitle();
    }
    return fullList;
    }

}
