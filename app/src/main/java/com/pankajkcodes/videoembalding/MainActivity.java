package com.pankajkcodes.videoembalding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView videoClip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoClip = findViewById(R.id.videoView);
        videoClip.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video);
        MediaController mediaController = new MediaController(this);
        videoClip.setMediaController(mediaController);
        mediaController.setAnchorView(videoClip);
        videoClip.start();

    }
}