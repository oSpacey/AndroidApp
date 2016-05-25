package com.example.id2013_03.android_app;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    TabLayout tabLayout;

    TextView specTx;
    TextView overTx;
    TextView exclusiveTx;
    TextView heritageTx;
    TextView brochureTx;

    Typeface custom_font;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String fontPath = "fonts/Roboto-Regular.ttf";
        custom_font = Typeface.createFromAsset(getAssets(), fontPath);

        specTx = (TextView) findViewById(R.id.spec_text);
        specTx.setTypeface(custom_font);

        overTx = (TextView) findViewById(R.id.over_text);
        overTx.setTypeface(custom_font);

        exclusiveTx = (TextView) findViewById(R.id.over_text);
        exclusiveTx.setTypeface(custom_font);

        heritageTx = (TextView) findViewById(R.id.over_text);
        heritageTx.setTypeface(custom_font);

        brochureTx = (TextView) findViewById(R.id.over_text);
        brochureTx.setTypeface(custom_font);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(new CustomAdapter(getSupportFragmentManager(), getApplicationContext()));

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                //tabLayout.setBackgroundColor(Color.GRAY);
                tabLayout.setSelectedTabIndicatorColor(Color.GRAY);

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

            }

        });


    }


    private class CustomAdapter extends FragmentStatePagerAdapter {
        private String fragments[] = {"", "", "", "", ""};

        public CustomAdapter(FragmentManager supportFragmentManager, Context applicationContext) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new Specification();
                case 1:
                    return new Overview();
                case 2:
                    return new Exclusivity();
                case 3:
                    return new Heritage();
                case 4:
                    return new Brochure();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return fragments.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return fragments[position];
        }


    }
}
