package com.duymanh.myapplication.model;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.duymanh.myapplication.R;

public class ScheduleAdapter extends ArrayAdapter<Schedule> {

    private Context context;
    private Schedule[] sList;
    public ScheduleAdapter(@NonNull Context context, Schedule[] sList) {
        super(context, R.layout.item_schedule,sList);
        this.context = context;
        this.sList = sList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_schedule,null,true);

        TextView txtName = view.findViewById(R.id.txtName);
        TextView txtCategory = view.findViewById(R.id.txtCategory);
        TextView txtTime = view.findViewById(R.id.txtTime);
        ImageView delete = view.findViewById(R.id.delete);

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle("Xác nhận xóa");
                builder.setMessage("Bạn có chắc chắn muốn xóa không?");
                builder.setPositiveButton("Xác nhận", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(context, "Xóa thành công", Toast.LENGTH_SHORT).show();
                    }
                });
                // Sử dụng setNegativeButton() để đặt nút "Hủy"
                builder.setNegativeButton("Hủy", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(context, "Hủy xóa thành công", Toast.LENGTH_SHORT).show();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });


        Schedule s = sList[position];
        txtName.setText(s.getName());
        txtCategory.setText(s.getCategoty());
        txtTime.setText(s.getTime());



        return view;
    }

    public Schedule getItem(int position) {
        return sList[position];
    }
}
