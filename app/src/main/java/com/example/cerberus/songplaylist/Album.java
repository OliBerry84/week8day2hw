package com.example.cerberus.songplaylist;

import java.io.Serializable;

/**
 * Created by cerberus on 20/03/2018.
 */

public class Album implements Serializable {

    private Integer ranking;
    private String artist;
    private String album;

    public Album(Integer ranking, String artist, String album){
        this.ranking = ranking;
        this.artist = artist;
        this.album = album;
    }

    public Integer getRanking(){
        return ranking;
    }

    public String getArtist(){
        return artist;
    }

    public String getAlbum(){
        return album;
    }
}
