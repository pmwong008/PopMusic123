package com.example.steivew.popmusic123;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class  PlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        TextView playerActivityText = (TextView) findViewById(R.id.player_activity_description);
        String playerText = getString(R.string.player_activity_description);
        playerActivityText.setText(playerText);

        TextView goToPlaylist = (TextView) findViewById(R.id.go_to_playlist_button);
        TextView upgradeToPremium = (TextView) findViewById(R.id.upgrade_button);
        TextView backToHome = (TextView) findViewById(R.id.back_to_home_button);

        if (goToPlaylist != null) {
            goToPlaylist.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Intent playlistIntent = new Intent(PlayerActivity.this, MycollectionActivity.class);
                    startActivity(playlistIntent);
                }
            });
        }

        if (upgradeToPremium != null) {
            upgradeToPremium.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Intent upgradeIntent = new Intent(PlayerActivity.this, PaymentActivity.class);
                    startActivity(upgradeIntent);
                }
            });
        }

        if (backToHome != null) {
            backToHome.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Intent backToHomeIntent = new Intent(PlayerActivity.this, MainActivity.class);
                    startActivity(backToHomeIntent);
                }
            });
        }
    }
}
