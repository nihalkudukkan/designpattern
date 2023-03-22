package com.example.composite;

public abstract class SongComponent {
    public void add(SongComponent songComponent) {
        throw new UnsupportedOperationException();
    }

    public String getSongName() {
        throw new UnsupportedOperationException();
    }

    public String getBandName() {
        throw new UnsupportedOperationException();
    }

    public void disPlaySongInfo() {
        throw new UnsupportedOperationException();
    }
}
