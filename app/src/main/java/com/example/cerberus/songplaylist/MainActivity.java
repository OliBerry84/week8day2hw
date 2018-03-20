package com.example.cerberus.songplaylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TopAlbums topAlbums = new TopAlbums();
        ArrayList<Album> list = topAlbums.getList();
        TopAlbumsAdapter albumAdapter = new TopAlbumsAdapter(this, list);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(albumAdapter);
    }
}