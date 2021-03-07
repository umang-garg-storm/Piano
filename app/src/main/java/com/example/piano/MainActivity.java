package com.example.piano;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, SoundPool.OnLoadCompleteListener {

    private SoundPool sp;
    private int sound1,sound2,sound3,sound4,sound5,sound6,sound7,sound8,sound9,sound10,sound11,sound12,sound13,sound14,sound15,sound16,sound17,sound18,sound19,sound20,sound21,sound22,sound23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button White1 =findViewById(R.id.white1);
        Button White2 =findViewById(R.id.white2);
        Button White3 =findViewById(R.id.white3);
        Button White4 =findViewById(R.id.white4);
        Button White5 =findViewById(R.id.white5);
        Button White6 =findViewById(R.id.white6);
        Button White7 =findViewById(R.id.white7);
        Button White8 =findViewById(R.id.white8);
        Button White9 =findViewById(R.id.white9);
        Button White10 =findViewById(R.id.white10);
        Button White11 =findViewById(R.id.white11);
        Button black1 =findViewById(R.id.black1);
        Button black2 =findViewById(R.id.black2);
        Button black3 =findViewById(R.id.black3);
        Button black4 =findViewById(R.id.black4);
        Button black5 =findViewById(R.id.black5);
        Button black6 =findViewById(R.id.black6);
        Button black7 =findViewById(R.id.black7);

        black1.setOnClickListener(this);
        black2.setOnClickListener(this);
        black3.setOnClickListener(this);
        black4.setOnClickListener(this);
        black5.setOnClickListener(this);
        black6.setOnClickListener(this);
        black7.setOnClickListener(this);
        White1.setOnClickListener(this);
        White2.setOnClickListener(this);
        White3.setOnClickListener(this);
        White4.setOnClickListener(this);
        White5.setOnClickListener(this);
        White6.setOnClickListener(this);
        White7.setOnClickListener(this);
        White8.setOnClickListener(this);
        White9.setOnClickListener(this);
        White10.setOnClickListener(this);
        White11.setOnClickListener(this);
        setupPianoSound();
    }

    private void setupPianoSound() {
        SoundPool.Builder spb = new SoundPool.Builder();
        spb.setMaxStreams(5);
        AudioAttributes attributes =new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_MEDIA)
                .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                .build();
        spb.setAudioAttributes(attributes);
        sp = spb.build();
        sound1 = sp.load(this, R.raw.a3, 1);
        sound2 = sp.load(this, R.raw.a_3, 1);
        sound3 = sp.load(this, R.raw.a_4, 1);
        sound4 = sp.load(this, R.raw.a_5, 1);
        sound5 = sp.load(this, R.raw.c3, 1);
        sound6 = sp.load(this, R.raw.c4_middle, 1);
        sound7 = sp.load(this, R.raw.c5, 1);
        sound8 = sp.load(this, R.raw.c6, 1);
        sound9 = sp.load(this, R.raw.c_4, 1);
        sound10 = sp.load(this, R.raw.c_5, 1);
        sound11 = sp.load(this, R.raw.d3, 1);
        sound12 = sp.load(this, R.raw.d4, 1);
        sound13 = sp.load(this, R.raw.d5, 1);
        sound14 = sp.load(this, R.raw.d_3, 1);
        sound15 = sp.load(this, R.raw.d_4, 1);
        sound16 = sp.load(this, R.raw.d_5,1);
        sound17 = sp.load(this, R.raw.e5, 1);
        sound18 = sp.load(this, R.raw.f3, 1);
        sound19= sp.load(this, R.raw.f4, 1);
        sound20 = sp.load(this, R.raw.f5, 1);
        sound21 = sp.load(this, R.raw.f_3, 1);
        sound22 = sp.load(this, R.raw.f_4, 1);
        sound23 = sp.load(this, R.raw.f_5, 1);

        sp.setOnLoadCompleteListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.white1:
                playSound(1);
                break;
            case R.id.white2:
                playSound(2);
                break;
            case R.id.white3:
                playSound(3);
                break;
            case R.id.white4:
                playSound(4);
                break;
            case R.id.white5:
                playSound(5);
                break;
            case R.id.white6:
                playSound(6);
                break;
            case R.id.white7:
                playSound(7);
                break;
            case R.id.white8:
                playSound(8);
                break;
            case R.id.white9:
                playSound(9);
                break;
            case R.id.white10:
                playSound(10);
                break;
            case R.id.white11:
                playSound(11);
                break;
            case R.id.black1:
                playSound(12);
                break;
            case R.id.black2:
                playSound(13);
                break;
            case R.id.black3:
                playSound(14);
                break;
            case R.id.black4:
                playSound(15);
                break;
            case R.id.black5:
                playSound(16);
                break;
            case R.id.black6:
                playSound(17);
                break;
            case R.id.black7:
                playSound(18);
                break;
        }
    }

    private void playSound(int pos) {
        switch (pos){
            case 1: sp.play(sound1,1,1,1,0,1);break;
            case 2: sp.play(sound2,1,1,1,0,1);break;
            case 3: sp.play(sound3,1,1,1,0,1);break;
            case 4: sp.play(sound4,1,1,1,0,1);break;
            case 5: sp.play(sound5,1,1,1,0,1);break;
            case 6: sp.play(sound6,1,1,1,0,1);break;
            case 7: sp.play(sound7,1,1,1,0,1);break;
            case 8: sp.play(sound8,1,1,1,0,1);break;
            case 9: sp.play(sound9,1,1,1,0,1);break;
            case 10: sp.play(sound10,1,1,1,0,1);break;
            case 11: sp.play(sound11,1,1,1,0,1);break;
            case 12: sp.play(sound12,1,1,1,0,1);break;
            case 13: sp.play(sound13,1,1,1,0,1);break;
            case 14: sp.play(sound14,1,1,1,0,1);break;
            case 15: sp.play(sound15,1,1,1,0,1);break;
            case 16: sp.play(sound16,1,1,1,0,1);break;
            case 17: sp.play(sound17,1,1,1,0,1);break;
            case 18: sp.play(sound18,1,1,1,0,1);break;
            case 19: sp.play(sound19,1,1,1,0,1);break;
            case 20: sp.play(sound20,1,1,1,0,1);break;

        }
    }

    @Override
    public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
        if(status==0){
            Toast.makeText(this, "music loaded", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "error occurred", Toast.LENGTH_SHORT).show();
        }
    }
}
