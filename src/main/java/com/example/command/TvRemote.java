package com.example.command;

public class TvRemote {
    public static Tv getTv(String name) {
        return new Tv(name);
    }
}
