package com.example.pc_marinaheliezadeh.tp_android_fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;

/**
 * Created by Pc-MarinaHelieZadeh on 07/02/2016.
 */
public class FragmentVue extends Fragment {

    private String[] sourisgaming= {"logitech g300s","Mad Catz R.A.T.7"};
    private DataTransmit dataTransmit;

    public interface DataTransmit {
        public void transmit (String data);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState)
    {
        final  View view = inflater.inflate(R.layout.fragment_des_vues, container, false);
        final NumberPicker nbrPicker = (NumberPicker)view.findViewById(R.id.numberPicker);
        nbrPicker.setMinValue(0);
        nbrPicker.setMaxValue(sourisgaming.length - 1);
        nbrPicker.setDisplayedValues(sourisgaming);
        nbrPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                dataTransmit = (DataTransmit) getActivity();
                dataTransmit.transmit(sourisgaming[nbrPicker.getValue()]);
            }
        });
        return view;
    }

}
