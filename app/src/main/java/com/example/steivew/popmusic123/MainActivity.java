package com.example.steivew.popmusic123;

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

        TextView musicLibrary = (TextView) findViewById(R.id.search_music_library);
        TextView radioStation = (TextView) findViewById(R.id.search_radio_station);
        TextView playlist = (TextView) findViewById(R.id.my_music_collection);
        TextView upgrade = (TextView) findViewById(R.id.upgrade_premium);

        /* inflate text  here*/
        TextView mainActivityText = (TextView) findViewById(R.id.main_activity_description);
        String intro = getString(R.string.main_activity_description);
        mainActivityText.setText(intro);

        /* set onClickListeners */

        if (musicLibrary != null) {
            musicLibrary.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Intent musicLibIntent = new Intent(MainActivity.this, MusiclibraryActivity.class);
                    startActivity(musicLibIntent);
                }
            });
        }



        if (radioStation != null) {
            radioStation.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Intent radioIntent = new Intent(MainActivity.this, RadiostationActivity.class);
                    startActivity(radioIntent);
                }
            });
        }

        if (playlist != null) {
            playlist.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Intent playlistIntent = new Intent(MainActivity.this, MycollectionActivity.class);
                    startActivity(playlistIntent);
                }
            });
        }

        if (upgrade != null) {
            upgrade.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Intent upgradeIntent = new Intent(MainActivity.this, PaymentActivity.class);
                    startActivity(upgradeIntent);
                }
            });
        }
    }
}
