package com.example.ed27;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mplayer;

    private ImageView imageView1;
    private ImageView imageView2;
    private ImageView imageView3;
    private int image1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hook
        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView3 = (ImageView) findViewById(R.id.imageView3);


        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(image1 == 0) {
                    Animator set = AnimatorInflater.loadAnimator(MainActivity.this, R.animator.frontanimator);
                    set.setTarget(v);
                    set.start();
                    image1++;
                }else {
                    Animator set = AnimatorInflater.loadAnimator(MainActivity.this, R.animator.backanimator);
                    set.setTarget(v);
                    set.start();
                    image1 = 0;

                }
            }
        });
    }
}