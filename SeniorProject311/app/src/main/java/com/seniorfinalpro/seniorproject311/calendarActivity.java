package com.seniorfinalpro.seniorproject311;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import org.jetbrains.annotations.NotNull;

import java.util.Date;

import jp.co.recruit_mp.android.lightcalendarview.LightCalendarView;
import jp.co.recruit_mp.android.lightcalendarview.MonthView;

/**
 * Created by Pc100 on 12/12/2559.
 */

public class calendarActivity extends AppCompatActivity {
    LightCalendarView calendarView;
    TextView tv_month;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calender_layout);
        tv_month = (TextView)findViewById(R.id.tv_month);
        calendarView = (LightCalendarView)findViewById(R.id.calendarView);
        String[] calendarPage = calendarView.getMonthCurrent().toString().split(" ");
        Log.e("page",calendarView.getMonthCurrent().toString());
        tv_month.setText(calendarPage[1]+" "+calendarPage[5]);
        calendarView.setOnStateUpdatedListener(new LightCalendarView.OnStateUpdatedListener() {
            @Override
            public void onMonthSelected(@NotNull Date date, @NotNull MonthView monthView) {

            }

            @Override
            public void onDateSelected(@NotNull Date date) {
//                Toast.makeText(calendarActivity.this, date.toString(), Toast.LENGTH_SHORT).show();
//                Log.e("Test",""+"sdssdsdsdsd");
                Intent intent = new Intent(calendarActivity.this,ActivityDetail.class);
                intent.putExtra("date",date.toString());
                startActivity(intent);


            }
        });

        calendarView.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                String[] calendarPage = calendarView.getMonthCurrent().toString().split(" ");
                Log.e("page",calendarView.getMonthCurrent().toString());
                tv_month.setText(calendarPage[1]+" "+calendarPage[5]);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


    }



}

