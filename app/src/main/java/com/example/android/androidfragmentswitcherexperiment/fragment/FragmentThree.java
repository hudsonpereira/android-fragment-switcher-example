package com.example.android.androidfragmentswitcherexperiment.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.androidfragmentswitcherexperiment.R;

/**
 * Created by hudson on 10/05/18.
 */

public class FragmentThree extends Fragment{

    public FragmentThree() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_simple_layout_1, container, false);

        String className = this.getClass().getSimpleName();
        ((TextView) view.findViewById(R.id.text_view)).setText(className);

        return view;
    }
}
