package com.example.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class SongGroup extends SongComponent {
    ArrayList songComponents = new ArrayList();

    String groupName;
    String groupDescription;

    public SongGroup(String groupName, String groupDescription) {
        this.groupName = groupName;
        this.groupDescription = groupDescription;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    public void disPlaySongInfo() {
        System.out.println(getGroupName() + " " + getGroupDescription() + "\n");
        Iterator songIterator = songComponents.iterator();

        while (songIterator.hasNext()) {
            SongComponent songInfo = (SongComponent) songIterator.next();
            songInfo.disPlaySongInfo();
        }
    }

    public void add(SongComponent newSongComponent) {
        songComponents.add(newSongComponent);
    }

}
