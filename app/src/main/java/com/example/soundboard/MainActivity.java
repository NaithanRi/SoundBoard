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

    private Button btnalientalk;

    private Button btnfalling;

    private Button btnscifibleep;

    private Button btnsneeze;

    private Button btnhorrorchaos;

    private Button btnfalling;

    private Button falling;

    private Button falling;

    private Button falling;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inititalize buttons
        btnBleep = findViewById(R.id.btn_bleep);
        btnWoops = findViewById(R.id.btn_woops);
        btnarcadeGameover = findViewById(R.id.btn_gameover);
        btnalientalk = findViewById(R.id.btn_alientalk);
        btnalientalk = findViewById(R.id.btn_falling);
        btnalientalk = findViewById(R.id.btn_scifibleep);
        btnalientalk = findViewById(R.id.btn_sneeze);
        btnalientalk = findViewById(R.id.btn_horrorchaos);



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
        btnalientalk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAlientalk();
            }
        });
        btnfalling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playFalling();
            }
        });
        btnscifibleep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playScifibleep();
            }
        });
        btnsneeze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSneeze();
            }
        });
        btnhorrorchaos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playHorrorchaos();
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

    private void playAlientalk(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sound_alientalk);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }

    private void playFalling(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sound_falling);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }
    private void playScifibleep(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sound_scifibleep);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }
    private void playSneeze(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sound_sneeze);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }
    private void playHorrorchaos(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sound_horrorchaos);
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