package com.example.cerberus.songplaylist;

import java.util.ArrayList;

/**
 * Created by cerberus on 20/03/2018.
 */

public class TopAlbums {

    private ArrayList<Album> list;

    public TopAlbums() {
        list = new ArrayList<Album>();
        list.add(new Album(1, "Trivium", "Silence in the Snow"));
        list.add(new Album(2, "Korn", "The Serenity of Suffering"));
        list.add(new Album(3, "Stone Sour", "Audio Secrecy"));
        list.add(new Album(4, "AC/DC", "Back in Black"));
        list.add(new Album(5, "Velvet Revolver", "Contraband"));
        list.add(new Album(6, "Jimmy Eat World", "Damage"));
        list.add(new Album(7, "Oasis", "Definitely Maybe"));
        list.add(new Album(8, "Device", "Device"));
        list.add(new Album(9, "Hoobastank", "Hoobastank"));
        list.add(new Album(10, "Placebo", "Placebo - Greatest Hits"));
        list.add(new Album(11, "Avenged Sevenfold", "Hail to the King"));
        list.add(new Album(12, "Spineshank", "The Height of Callousness"));
        list.add(new Album(13, "Royal Blood", "How Did We Get So Dark"));
        list.add(new Album(14, "All Tvvins", "IIVV"));
        list.add(new Album(15, "Metallica", "Black Album"));
    }

    public ArrayList<Album> getList() {
        return new ArrayList<Album>(list);
    }
}
