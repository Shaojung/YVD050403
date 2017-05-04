package com.example.yvtc.yvd050403;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ActionMode;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click1(View v)
    {
        Intent it = new Intent();
        it.setAction("MyClock");
        PendingIntent pi =
                PendingIntent.getBroadcast(MainActivity.this, 321, it, PendingIntent.FLAG_ONE_SHOT);

        Calendar alarm = Calendar.getInstance();
        alarm.set(Calendar.HOUR_OF_DAY, 7);
        alarm.set(Calendar.MINUTE, 52);

        AlarmManager am = (AlarmManager) getSystemService(ALARM_SERVICE);
        am.set(AlarmManager.RTC_WAKEUP, alarm.getTimeInMillis(), pi);
    }
}
