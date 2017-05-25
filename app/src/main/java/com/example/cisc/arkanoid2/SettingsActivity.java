package com.example.cisc.arkanoid2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class SettingsActivity extends AppCompatActivity implements View.OnClickListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Button musicButton = (Button) findViewById(R.id.musicButton);
        musicButton.setOnClickListener(this);
        Button soundFXButton = (Button) findViewById(R.id.soundFXButton);
        soundFXButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.musicButton:
            MainActivity.player.release();
                break;
            case R.id.soundFXButton:
                //final MediaPlayer settingsButtonSound = MediaPlayer.create(this, R.raw.metroiddoor) ;
                //settingsButtonSound.start();
                //startActivity(new Intent(MainActivity.this,SettingsActivity.class));
                break;
        }
    }
}
