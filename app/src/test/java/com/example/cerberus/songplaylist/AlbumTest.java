package com.example.cerberus.songplaylist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cerberus on 20/03/2018.
 */

public class AlbumTest {

    Album album;

    @Before
    public void before(){
        album = new Album(123456789, "Justin Beaver", "No one's a Beaver");
    }

    @Test
    public void canGetRanking(){
        assertEquals((Integer)123456789, album.getRanking());
    }

    @Test
    public void canGetArtist(){
        assertEquals("Justin Beaver", album.getArtist());
    }

    @Test
    public void canGetAlbum(){
        assertEquals("No one's a Beaver", album.getAlbum());
    }
}
