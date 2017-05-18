package com.example.cisc.arkanoid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent bm = new Intent(this, BackgroundMusicService.class);
        startService(bm);

        View view = new View(this);
        view.bringToFront();
        view.setBackgroundResource(R.drawable.arkanoid);
        Button play = (Button) findViewById(R.id.buttonPlay);
        play.setOnClickListener(this);
        Button settings = (Button) findViewById(R.id.buttonSettings);
        settings.setOnClickListener(this);

        //Animation shake = AnimationUtils.loadAnimation(this, R.anim.shake);
    }
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.buttonPlay:
                Animation shake = AnimationUtils.loadAnimation(this, R.anim.shake);
                v.startAnimation(shake);
                startActivity(new Intent(MainActivity.this,GameActivity.class));
                break;
            case R.id.buttonSettings:
                startActivity(new Intent(MainActivity.this,SettingsActivity.class));
                break;
        }
    }

}


