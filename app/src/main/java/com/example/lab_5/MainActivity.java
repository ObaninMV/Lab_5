package com.example.lab_5;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity
{
    VideoView MyvideoPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyvideoPlayer = (VideoView)findViewById(R.id.videoView);
        Uri myVideoUri= Uri.parse( "android.resource://" +
        getPackageName() + "/" + R.raw.systemf);
        MyvideoPlayer.setVideoURI(myVideoUri);
        MediaController mediaController = new MediaController(this);
        MyvideoPlayer.setMediaController(mediaController);
        mediaController.setMediaPlayer(MyvideoPlayer);
    }

    public void onStart(View view) {
        MyvideoPlayer.start();
    }

    public void onPause(View view) {
        MyvideoPlayer.pause();
    }

    public void onReplay(View view) {
        MyvideoPlayer.stopPlayback();
        MyvideoPlayer.resume();
    }
}