package com.alexisegf.badapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class BadActivity extends Activity {

    static {
        System.loadLibrary("bad-native-lib");
    }

    native String stringFromJNI();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bad);

        stringFromJNI();
        String badText = "Not ready yet";
        ((TextView) findViewById(R.id.badTV)).setText(badText);
    }
}
