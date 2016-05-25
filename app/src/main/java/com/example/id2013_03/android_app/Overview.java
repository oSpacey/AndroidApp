package com.example.id2013_03.android_app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;

/**
 * Created by ID2013-03 on 09/05/2016.
 */
public class Overview extends Fragment {

    MediaController mediaController;
    DisplayMetrics dm;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Creating the view layout for this class... It calls the cml file tabbed_heritage
        // This is then stored into the variable view to make it easier to call upon again later
        View view = inflater.inflate(R.layout.overview, container, false);


        return view;
    }

}
