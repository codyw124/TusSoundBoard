package com.cody.tussoundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initButton(R.id.bro_oh_my_word, R.raw.tus_bro_oh_my_word);
        initButton(R.id.nah, R.raw.tus_nah);
        initButton(R.id.nothing, R.raw.tus_nothing);
        initButton(R.id.oh_my_gosh, R.raw.tus_oh_my_gosh);
        initButton(R.id.oh_my_gosh_man, R.raw.tus_oh_my_gosh_man);
        initButton(R.id.oh_my_word, R.raw.tus_oh_my_word);
    }

    private void initButton(int buttonId, int sound){
        Button button = (Button)this.findViewById(buttonId);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, sound);

        button.setOnClickListener(new OnClickListener(){
            @Override public void onClick(View v) {
                mediaPlayer.start();
            }
        });
    }
}