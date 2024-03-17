package com.duymanh.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.duymanh.myapplication.model.Schedule;
import com.duymanh.myapplication.model.ScheduleAdapter;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ScheduleAdapter adapter;

    private ImageView imgChart_tableAllProcess;


    private Schedule[] schedules;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgChart_tableAllProcess = findViewById(R.id.imgChart_tableAllProcess);
        imgChart_tableAllProcess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),DetailScheduleActivity.class);
                startActivity(intent);
            }
        });

        listView = findViewById(R.id.list_task);
        initData();
        adapter = new ScheduleAdapter(this,schedules);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Schedule s = adapter.getItem(position);
                Intent intent = new Intent(MainActivity.this,DetailScheduleActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initData() {
        String[] names = {"Landing Page Agency Creative","React JS for E-Commerce Web","Choi Pinano PUKOCHIHA","Di xem phim voi nguoi yeu"};
        String[] categorys = {"Work Daily","Learn Daily","Giai Tri","Giai Tri"};
        String[] times = {"10:20 - 15:30","9:45 - 13:00", "7:25 - 09:05","23:00 - 02:00"};
        schedules = new Schedule[names.length];
        for(int i=0;i<schedules.length;i++){
            schedules[i] = new Schedule(names[i],categorys[i],times[i]);
        }
    }
}