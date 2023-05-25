package com.example.soundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //buttons
    private Button btnBleep;
    private Button btnWoops;

    private Button btnarcadeGameover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inititalize buttons
        btnBleep = findViewById(R.id.btn_bleep);
        btnWoops = findViewById(R.id.btn_woops);
        btnarcadeGameover = findViewById(R.id.btn_gameover);

        btnBleep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playBleep();
            }
        });

        btnWoops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playWoops();
            }
        });

        btnarcadeGameover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playArcade();
            }
        });


    }

    private void playWoops(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sound_woops);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }

    private void playBleep(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sound_bleep);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }

    private void playArcade(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sound_arcadegameover);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }
}