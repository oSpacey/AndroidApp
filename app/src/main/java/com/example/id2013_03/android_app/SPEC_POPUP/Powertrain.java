package com.example.id2013_03.android_app.SPEC_POPUP;
/*
     ---------------------------------------------------------------------------------------------------------------------------
                                            Imported necessary functions
     ---------------------------------------------------------------------------------------------------------------------------
*/

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

import com.example.id2013_03.android_app.R;

import static android.view.Gravity.BOTTOM;

/*
     ---------------------------------------------------------------------------------------------------------------------------
                                            Main class for this section
     ---------------------------------------------------------------------------------------------------------------------------
*/
public class Powertrain extends Activity {

    /*
         ---------------------------------------------------------------------------------------------------------------------------
                                    Variables used throughout this page of code
         ---------------------------------------------------------------------------------------------------------------------------
    */
    ScrollView powerScroll;

    ImageView closePowerPop;
    ImageView engineBtn;
    ImageView transmitionBtn;
    ImageView exhaustBtn;
    ImageView lubricationBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.powertrain);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((width * 1), (int) (height * .95));

        getWindow().setGravity(BOTTOM);


        closePowerPop = (ImageView) findViewById(R.id.closePower);
        closePowerPop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });


        engineBtn = (ImageView) findViewById(R.id.engine_btn);
        transmitionBtn = (ImageView) findViewById(R.id.transmission_btn);
        exhaustBtn = (ImageView) findViewById(R.id.exhaust_btn);
        lubricationBtn = (ImageView) findViewById(R.id.lubrication_btn);

        powerScroll = (ScrollView) findViewById(R.id.power_scroll);

        engineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                powerScroll.scrollTo(0, 718);
                engineBtn.setBackgroundResource(R.drawable.exclusivity_oval_pressed);
                transmitionBtn.setBackgroundResource(R.drawable.exclusivity_oval);
                exhaustBtn.setBackgroundResource(R.drawable.exclusivity_oval);
                lubricationBtn.setBackgroundResource(R.drawable.exclusivity_oval);

            }
        });


        transmitionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                powerScroll.scrollTo(0, 1431);
                engineBtn.setBackgroundResource(R.drawable.exclusivity_oval);
                transmitionBtn.setBackgroundResource(R.drawable.exclusivity_oval_pressed);
                exhaustBtn.setBackgroundResource(R.drawable.exclusivity_oval);
                lubricationBtn.setBackgroundResource(R.drawable.exclusivity_oval);

            }
        });

        exhaustBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                powerScroll.scrollTo(0, 2145);
                engineBtn.setBackgroundResource(R.drawable.exclusivity_oval);
                transmitionBtn.setBackgroundResource(R.drawable.exclusivity_oval);
                exhaustBtn.setBackgroundResource(R.drawable.exclusivity_oval_pressed);
                lubricationBtn.setBackgroundResource(R.drawable.exclusivity_oval);

            }
        });

        lubricationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                powerScroll.scrollTo(0, 2955);
                engineBtn.setBackgroundResource(R.drawable.exclusivity_oval);
                transmitionBtn.setBackgroundResource(R.drawable.exclusivity_oval);
                exhaustBtn.setBackgroundResource(R.drawable.exclusivity_oval);
                lubricationBtn.setBackgroundResource(R.drawable.exclusivity_oval_pressed);

            }
        });

    }

}


