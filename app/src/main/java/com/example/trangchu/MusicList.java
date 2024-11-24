package com.example.trangchu;

import java.net.URI;

public class MusicList {
    private String title, artist, duration;
    private boolean isplay;
    private URI musicfile;

    public MusicList(String title, String artist, String duration, boolean isplay, URI musicfile) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.isplay = isplay;
        this.musicfile = musicfile;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getDuration() {
        return duration;
    }

    public boolean isIsplay() {
        return isplay;
    }

    public URI getMusicfile() {
        return musicfile;
    }
}
