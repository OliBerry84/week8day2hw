//package com.example.cerberus.songplaylist;
//
//import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.util.Log;
//import android.widget.ImageView;
//
//public class TriviumActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_trivium);
//
//        ImageView myImageView = (ImageView) findViewById(R.id.triviumImage);
//        myImageView.setImageResource(R.drawable.silenceinsnow);
//
//        Intent intent = getIntent();
//        Bundle extras = intent.getExtras();
//        String albumInfo = extras.getString("albuminfo");
//        albuminfoTextView.setText(albuminfo);
//
//        Album selectedAlbum = (Album) intent.getSerializableExtra("album");
//        Log.d("TriviumActivity", selectedAlbum.getAlbum());
//    }
//}