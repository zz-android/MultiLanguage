package com.ruijie.multilanguage;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class Main2Activity extends Activity {

    TextView titleTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        titleTV = findViewById(R.id.titleTV);

        titleTV.setText(R.string.title);

    }






}
