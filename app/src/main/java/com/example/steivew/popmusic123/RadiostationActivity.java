package com.example.steivew.popmusic123;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class RadiostationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiostations);

        TextView radioStationActivityText = (TextView) findViewById(R.id.radio_station_activity_description);
        String radioStationText = getString(R.string.radio_station_activity_description);
        radioStationActivityText.setText(radioStationText);

        ImageButton playButton = (ImageButton) findViewById(R.id.play_radio_station_button);

        if (playButton != null) {
            playButton.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Intent playerIntent = new Intent(RadiostationActivity.this, PlayerActivity.class);
                    startActivity(playerIntent);
                }
            });
        }
    }
}
