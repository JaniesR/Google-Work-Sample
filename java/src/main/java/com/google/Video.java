package com.google;

import java.util.Collections;
import java.util.List;

/** A class used to represent a video. */
class Video {

  private final String title;
  private final String videoId;
  private final List<String> tags;
  private boolean paused = false;

  Video(String title, String videoId, List<String> tags) {
    this.title = title;
    this.videoId = videoId;
    this.tags = Collections.unmodifiableList(tags);
  }

  /** Returns the title of the video. */
  String getTitle() {
    return title;
  }

  /** Returns the video id of the video. */
  String getVideoId() {
    return videoId;
  }

  /** Returns a readonly collection of the tags of the video. */
  List<String> getTags() { return tags; }

  /** Returns a readonly collection of the tags of the video. */
  boolean isPaused() { return paused;  }

  /** Switches the state of the video between paused and not paused. */
  void togglePause() { paused = !paused; }

  /** Returns the video file as a String that contains all its details. */
  String toText() {
    if (!paused) {
      return title + "(" + videoId + ")" + "[" + tags + "]";}
    else {
      return title + "(" + videoId + ")" + "[" + tags + "]" + "- PAUSED";}
  }
}
