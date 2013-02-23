package com.example.nyuad;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        sup();
        return true;
    }   
   
    public void sup() {
    	Intent intent = new Intent(this, MyAlarmManager.class);
    	long scTime = 60*2000;//2mins

    	PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 0, intent, 0);

    	AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
    	alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + scTime, pendingIntent);
    }
    
    public void translate(String annoucement) {
    	Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, annoucement);
        sendIntent.setType("mimix/mimix");
        startActivity(sendIntent);
    }
}