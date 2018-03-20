package com.example.cerberus.songplaylist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by cerberus on 20/03/2018.
 */

public class TopAlbumsAdapter extends ArrayAdapter<Album> {
    public TopAlbumsAdapter(Context context, ArrayList<Album> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
        Album currentAlbum = getItem(position);

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_album, parent, false);
        }

        TextView ranking = listItemView.findViewById(R.id.ranking);
        ranking.setText(currentAlbum.getRanking().toString());

        TextView album = listItemView.findViewById(R.id.album);
        album.setText(currentAlbum.getAlbum());

        TextView artist = listItemView.findViewById(R.id.artist);
        artist.setText(currentAlbum.getArtist());

        return listItemView;
    }
}