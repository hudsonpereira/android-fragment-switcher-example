package com.example.android.androidfragmentswitcherexperiment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.android.androidfragmentswitcherexperiment.fragment.FragmentFour;
import com.example.android.androidfragmentswitcherexperiment.fragment.FragmentOne;
import com.example.android.androidfragmentswitcherexperiment.fragment.FragmentThree;
import com.example.android.androidfragmentswitcherexperiment.fragment.FragmentTwo;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button mSwitchOne;
    Button mSwitchTwo;
    Button mSwitchThree;
    Button mSwitchFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSwitchOne = findViewById(R.id.switch_1);
        mSwitchTwo = findViewById(R.id.switch_2);
        mSwitchThree = findViewById(R.id.switch_3);
        mSwitchFour = findViewById(R.id.switch_4);

        mSwitchOne.setOnClickListener(this);
        mSwitchTwo.setOnClickListener(this);
        mSwitchThree.setOnClickListener(this);
        mSwitchFour.setOnClickListener(this);
    }

    public void switchFragment(Fragment fragment) {
        getFragmentManager().beginTransaction()
                .replace(R.id.fragment, fragment)
                .commit();
    }

    @Override
    public void onClick(View v) {
        Fragment fragment;

        switch (v.getId()) {
            case R.id.switch_1:
                fragment = new FragmentOne();
                break;
            case R.id.switch_2:
                fragment = new FragmentTwo();
                break;
            case R.id.switch_3:
                fragment = new FragmentThree();
                break;
            case R.id.switch_4:
                fragment = new FragmentFour();
                break;
            default:
                return;
        }

        switchFragment(fragment);
    }
}
