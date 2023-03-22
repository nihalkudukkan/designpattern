package com.example.composite;

public class Main {
    public static void main(String[] args) {
        SongComponent industrialMusic = new SongGroup("Industrial", "is a style of experimental music that draws on transgressive and provocative themes");
        SongComponent heavyMetalMusic = new SongGroup("\nHeavy Metal", "is a genre of rock that developed in the late 1960s, largely in the UK and in the US");
        SongComponent dubstepMusic = new SongGroup("\nDubstep", "is a genre of electronic dance music that originated in South London, England");

        SongComponent everySong = new SongGroup("Song List", "Every Song Available");

        everySong.add(industrialMusic);

        industrialMusic.add(new Song("Head like", "NIN", 1920));
        industrialMusic.add(new Song("body like", "Front", 1940));
        industrialMusic.add(dubstepMusic);

        dubstepMusic.add(new Song("Centepide", "knife", 2012));
        dubstepMusic.add(new Song("Traffic", "P", 2011));

        everySong.add(heavyMetalMusic);

        heavyMetalMusic.add(new Song("War Pigs", "Black Sabath", 1970));
        heavyMetalMusic.add(new Song("Ace of spades", "Motor", 1975));

        DiscJockey jockey = new DiscJockey(everySong);
        jockey.getSongList();
    }
}
