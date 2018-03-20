package com.example.cerberus.songplaylist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
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

//    public void onListItemClick(View listItem){
//        Album selectedAlbum = (Album) listItem.getTag();
//        Log.d("MainActivity", selectedAlbum.getAlbum());
//
//        Trivium trivium = new Trivium();
//        String albuminfo = trivium.getAlbumInfo();
//
//        Intent intent = new Intent(this, TriviumActivity.class);
//        intent.putExtra("album", selectedAlbum);
//
//        startActivity(intent);
//    }
}