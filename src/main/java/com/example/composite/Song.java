package com.example.composite;

public class Song extends SongComponent {
    String songName;
    String bandName;
    int releaseYear;

    public Song(String songName, String bandName, int releaseYear) {
        this.songName = songName;
        this.bandName = bandName;
        this.releaseYear = releaseYear;
    }

    @Override
    public void disPlaySongInfo() {
        System.out.println(songName + " was recorded by " + bandName + " in " + releaseYear);
    }
}
