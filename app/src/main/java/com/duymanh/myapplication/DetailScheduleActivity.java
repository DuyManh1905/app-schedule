package com.duymanh.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailScheduleActivity extends AppCompatActivity {

    private Button btnSaveTask;
    private int notificationid=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_schedule);

        btnSaveTask = findViewById(R.id.btnSaveTask);
        btnSaveTask.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("MissingPermission")
            @Override
            public void onClick(View v) {
//                NotificationCompat.Builder builder = new NotificationCompat.Builder(DetailScheduleActivity.this,MyNotification.CHANNEL_ID)
//                        .setContentTitle("Schedule Notification")
//                        .setContentText("10:20 - 15:30 Landing Page Agency Creative")
//                        .setSmallIcon(R.drawable.baseline_notifications_active_24)
//                        .setColor(Color.RED)
//                        .setCategory(NotificationCompat.CATEGORY_ALARM)
//                        .setDefaults(NotificationCompat.DEFAULT_SOUND);
//
//                NotificationManagerCompat managerCompat = NotificationManagerCompat.from(getApplicationContext());
//                managerCompat.notify(notificationid,builder.build());

                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }

}