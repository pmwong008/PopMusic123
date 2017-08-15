package com.example.steivew.popmusic123;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MusiclibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musiclibrary);

        TextView musicLibActivityText = (TextView) findViewById(R.id.music_library_activity_description);
        String musicLibText = getString(R.string.music_library_activity_description);
        musicLibActivityText.setText(musicLibText);

        ImageButton playButton = (ImageButton) findViewById(R.id.play_button_search_result);

        if (playButton != null) {
            playButton.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Intent playerIntent = new Intent(MusiclibraryActivity.this, PlayerActivity.class);
                    startActivity(playerIntent);
                }
            });
        }
    }




}
