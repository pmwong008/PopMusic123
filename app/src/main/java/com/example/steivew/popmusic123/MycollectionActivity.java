package com.example.steivew.popmusic123;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MycollectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mycollection);

        TextView mycollectionActivityText = (TextView) findViewById(R.id.my_collection_activity_description);
        String mycollectionText = getString(R.string.my_collection_activity_description);
        mycollectionActivityText.setText(mycollectionText);

        ImageButton playButton = (ImageButton) findViewById(R.id.play_button_playlist);


        if (playButton != null) {
            playButton.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Intent playerIntent = new Intent(MycollectionActivity.this, PlayerActivity.class);
                    startActivity(playerIntent);
                }
            });
        }

    }
}
