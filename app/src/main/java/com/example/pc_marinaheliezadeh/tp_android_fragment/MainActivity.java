package com.example.pc_marinaheliezadeh.tp_android_fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;


public class MainActivity extends AppCompatActivity implements FragmentVue.DataTransmit {

    public Page_adaptation page_adaptation = new page_adaptation(getSupportFragmentManager());
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.pager);
        viewPager.setAdapter(page_adaptation);

        PagerSlidingTabStrip tabs = (PagerSlidingTabStrip) findViewById(R.id.fragments);
        tabs.setShouldExpand(true);
        tabs.setViewPager(viewPager);
    }

    @Override
    public void transmit(String data) {
        FragmentImage tab2Fragment=(FragmentImage) page_adaptation.getItem(1);
        tab2Fragment.changeData(data);

    }
}
