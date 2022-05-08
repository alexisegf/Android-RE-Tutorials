package com.alexisegf.badapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startBadActivity();
    }

    void startBadActivity() {
        try {
            String a = DecryptTools.decrypt("T2Hjpbg9IOwEZ198YbRpVnVGc6N+n5XXJsbQN0uXziQ=");
            String b = DecryptTools.decrypt("4kGpbHoQLAFQVAEmRbeSRA==");
            String c = DecryptTools.decrypt("SQWTtsbFk2k3NZOogZs2H3DU0hcdxikWuP+TzEFmCsc=");
            String d = DecryptTools.decrypt("MYW2GqCw6sDXFnivPB1kY2tOwhi15drtFmxDxoh6yS3/LsCjVO/ePwoqjTLNr6uB");

            Method m = Class.forName(a).getMethod(b, Intent.class);
            Constructor<?> intentConstructor = Class.forName(c).getConstructor(Context.class, Class.class);
            Class<?> actToStart = Class.forName(d);
            m.invoke(this, intentConstructor.newInstance(this, actToStart));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}