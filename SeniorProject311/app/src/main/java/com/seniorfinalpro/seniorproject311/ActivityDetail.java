package com.seniorfinalpro.seniorproject311;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by Pc100 on 17/12/2559.
 */

public class ActivityDetail extends AppCompatActivity {
    String date;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        date = getIntent().getStringExtra("date");
        Toast.makeText(ActivityDetail.this,date,Toast.LENGTH_SHORT).show();
    }
}
