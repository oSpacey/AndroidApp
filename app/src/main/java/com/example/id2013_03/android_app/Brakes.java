package com.example.id2013_03.android_app;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import static android.view.Gravity.BOTTOM;


public class Brakes extends Activity {

    ImageView closeChassis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chassis_brakes);

        closeChassis = (ImageView) findViewById(R.id.closeChassis);
        closeChassis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((width * 1), (int) (height * .95));

        getWindow().setGravity(BOTTOM);

        /* Video setup...
            Finding the video view,
            Finding the path for the video,
            Displaying the video
            Adding a Media controller to the video
         */
        VideoView VV = (VideoView) findViewById(R.id.videoView);
        String UriPath = "android.resource://com.example.id2013_03.android_app/" + R.raw.chassis;
        MediaController MC = new MediaController(this);
        MC.setAnchorView(VV);
        Uri uri = Uri.parse(UriPath);
        VV.setVideoURI(uri);
        VV.requestFocus();
        VV.setMediaController(MC);
        VV.start();

    }
}
