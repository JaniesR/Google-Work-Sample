package com.google;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VideoPlayer {

  private final VideoLibrary videoLibrary = new VideoLibrary();
  private final List<Video> allVideos = videoLibrary.getVideos();
  private ArrayList<VideoPlaylist> allPlayLists = new ArrayList<>();
  private Video currentVideo = null;


  public VideoPlayer() { new VideoLibrary(); }

  public void numberOfVideos() {
    System.out.printf("%s videos in the library%n", allVideos.size());
  }

  public void showAllVideos() {
    System.out.println("All Videos: %n");
    for(Video vid : allVideos) {
      System.out.println(vid.toText() + "%n");
    }
  }

  // plays requested video
  public void playVideo(String videoId) {
    if (videoLibrary.getVideo(videoId) == null) {
    System.out.println("Cannot play video: Video does not exist"); }
    else if (currentVideo != null) {
      System.out.println("Stopping video: " + currentVideo.getTitle());
      currentVideo = null;
      currentVideo = videoLibrary.getVideo(videoId);
      System.out.println("Playing Video: " + currentVideo.getTitle());}
    else {
      currentVideo = videoLibrary.getVideo(videoId);
      System.out.println("Playing Video: " + currentVideo.getTitle());
    }
  }

  public void stopVideo() {
    if (currentVideo == null) {
      System.out.println("Cannot stop video: No video is currently playing.");
    } else{
      System.out.println("Stopping video: " + currentVideo.getTitle());
      currentVideo = null;
    }
  }

  public void playRandomVideo() {
    Random rand = new Random();
    int num = rand.nextInt(allVideos.size());
    String randomId = allVideos.get(num).getVideoId();
    playVideo(randomId);
  }

  public void pauseVideo() {
    if (currentVideo == null) {
      System.out.println("Cannot pause video: No video is currently playing.");
    } else if (currentVideo.isPaused()) {
      System.out.println("Video is already paused: " + currentVideo.getTitle());
    } else {
      System.out.println("Pausing video: " + currentVideo.getTitle());
      currentVideo.togglePause();
    }
  }

  public void continueVideo() {
    if (currentVideo == null) {
      System.out.println("Cannot continue video: No video is currently playing.");
    } else if (currentVideo.isPaused()) {
      System.out.println("Continuing video: " + currentVideo.getTitle());
      currentVideo.togglePause();
    } else {
      System.out.println("Cannot continue video: Video is not paused.");
    }
  }

  public void showPlaying() {
    if (currentVideo == null)
      System.out.println("No video is currently playing.");
    else {
      System.out.println("Currently playing: " + currentVideo.toText());
    }
  }

  public void createPlaylist(String playlistName) {
    if (allPlayLists.contains(playlistName))
    allPlayLists.add(new VideoPlaylist(playlistName));
    System.out.println("Successfully created new playlist: " + playlistName);
  }

  public void addVideoToPlaylist(String playlistName, String videoId) {
    System.out.println("addVideoToPlaylist needs implementation");
  }

  public void showAllPlaylists() {
    System.out.println("showAllPlaylists needs implementation");
  }

  public void showPlaylist(String playlistName) {
    System.out.println("showPlaylist needs implementation");
  }

  public void removeFromPlaylist(String playlistName, String videoId) {
    System.out.println("removeFromPlaylist needs implementation");
  }

  public void clearPlaylist(String playlistName) {
    System.out.println("clearPlaylist needs implementation");
  }

  public void deletePlaylist(String playlistName) {
    System.out.println("deletePlaylist needs implementation");
  }

  public void searchVideos(String searchTerm) {
    System.out.println("searchVideos needs implementation");
  }

  public void searchVideosWithTag(String videoTag) {
    System.out.println("searchVideosWithTag needs implementation");
  }

  public void flagVideo(String videoId) {
    System.out.println("flagVideo needs implementation");
  }

  public void flagVideo(String videoId, String reason) {
    System.out.println("flagVideo needs implementation");
  }

  public void allowVideo(String videoId) {
    System.out.println("allowVideo needs implementation");
  }
}