package com.example.cerberus.songplaylist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cerberus on 20/03/2018.
 */

public class TopAlbumTest {
    @Test
    public void getListTest() {
        TopAlbums topAlbums = new TopAlbums();
        assertEquals(15, topAlbums.getList().size());
    }
}
