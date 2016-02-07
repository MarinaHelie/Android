package com.example.pc_marinaheliezadeh.tp_android_fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Pc-MarinaHelieZadeh on 07/02/2016.
 */
public class FragmentImage extends Fragment {
    private ImageView imageView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub

        View view = inflater.inflate(R.layout.fragment_des_images, container, false);
        imageView=(ImageView)view.findViewById(R.id.imageView);
        return view;
    }
    public void changeData(String data)
    {
        int resId = getResources().getIdentifier(data.toLowerCase(), "drawable", getContext().getPackageName());
        imageView.setImageResource(resId);
    }
}
