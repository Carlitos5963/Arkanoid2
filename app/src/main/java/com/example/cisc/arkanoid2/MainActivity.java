package com.example.cisc.arkanoid2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    static MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player = MediaPlayer.create(this, R.raw.arcade);
        player.setLooping(true); // Set looping
        player.setVolume(100,100);
        player.start();


        View view = new View(this);
        view.bringToFront();
        view.setBackgroundResource(R.drawable.arkanoid);
        Button play = (Button) findViewById(R.id.buttonPlay);
        play.setOnClickListener(this);
        Button settings = (Button) findViewById(R.id.buttonSettings);
        settings.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.buttonPlay:
                Animation shake = AnimationUtils.loadAnimation(this, R.anim.shake);
                final MediaPlayer playButtonSound = MediaPlayer.create(this, R.raw.pacman);
                playButtonSound.start();
                v.startAnimation(shake);
                startActivity(new Intent(MainActivity.this,GameActivity.class));
                break;
            case R.id.buttonSettings:
                final MediaPlayer settingsButtonSound = MediaPlayer.create(this, R.raw.metroiddoor) ;
                settingsButtonSound.start();
                startActivity(new Intent(MainActivity.this,SettingsActivity.class));
                break;
        }
    }

    public void onStop(MediaPlayer player){
        player.stop();
        player.release();

    }

}


