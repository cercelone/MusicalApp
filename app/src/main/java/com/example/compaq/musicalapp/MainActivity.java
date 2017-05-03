package com.example.compaq.musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView melody = (TextView) findViewById(R.id.melody_text);
        TextView favorites = (TextView) findViewById(R.id.favorites);
        TextView mylists = (TextView) findViewById(R.id.mylists);
        TextView recents = (TextView) findViewById(R.id.recents);
        TextView albums = (TextView) findViewById(R.id.albums);

        melody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent melodyIntent = new Intent(MainActivity.this, MelodyActivity.class);
                startActivity(melodyIntent);
            }
        });

        favorites.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent favoritesIntent = new Intent(MainActivity.this, FavoritesActivity.class);
                startActivity(favoritesIntent);
            }
        });

        mylists.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent listsIntent = new Intent(MainActivity.this, ListsActivity.class);
                startActivity(listsIntent);
            }
        });

        recents.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                Intent recentsIntent = new Intent(MainActivity.this, RecentActivity.class);
                startActivity(recentsIntent);
            }
        });

        albums.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });
    }
}
