package com.example.pc_marinaheliezadeh.tp_android_fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Pc-MarinaHelieZadeh on 07/02/2016.
 */
public class Page_adaptation extends FragmentStatePagerAdapter
{
    private String[] labels = {"Liste elements", "image"};
    private FragmentVue fragvue;
    private  FragmentImage fragimg;

    public Page_adaptation(FragmentManager fm) {
        super(fm);
        fragvue = new FragmentVue();
        fragimg=new FragmentImage();
    }


    @Override
    public Fragment getItem(int i) {
        switch(i){
            case 0:
                return fragvue;
            case 1:
                return fragimg;
        }
        return null;
    }

    @Override
    public int getCount() {
        return labels.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return labels[position];
    }
}
