package com.example.face_recognition_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.example.face_recognition_android.adapter.StudentAdapter;
import com.example.face_recognition_android.model.Student;

import java.util.ArrayList;
import java.util.List;

public class ResultRollCallActivity extends AppCompatActivity {
    Intent intent = getIntent();
    private StudentAdapter adapter;
    private List<Student> list;
//
    public ResultRollCallActivity() {
    list = new ArrayList<>();

    list.add(new Student(1,R.drawable.person_icon,"Phan Tân", "MSSV: 19200473"));
    list.add(new Student(2,R.drawable.person_icon,"Nguyễn Văn A ", "MSSV: 19200473"));
    list.add(new Student(3,R.drawable.person_icon,"Nguyễn Văn B", "MSSV: 19200234"));
    list.add(new Student(4,R.drawable.person_icon,"Nguyễn Văn C", "MSSV: 19200342"));
    list.add(new Student(5,R.drawable.person_icon,"Nguyễn Văn D", "MSSV: 19200234"));
    list.add(new Student(6,R.drawable.person_icon,"Nguyễn Văn E", "MSSV: 19200345"));
    list.add(new Student(7,R.drawable.person_icon,"Nguyễn Văn F", "MSSV: 19200542"));
    list.add(new Student(8,R.drawable.person_icon,"Nguyễn Văn G", "MSSV: 19200656"));
    list.add(new Student(9,R.drawable.person_icon,"Nguyễn Văn H", "MSSV: 19200676"));
    list.add(new Student(10,R.drawable.person_icon,"Nguyễn Văn P", "MSSV: 19200342"));
    list.add(new Student(11,R.drawable.person_icon,"Nguyễn Văn K", "MSSV: 19200456"));
    list.add(new Student(12,R.drawable.person_icon,"Nguyễn Văn T", "MSSV: 19200786"));
//
    adapter = new StudentAdapter(this,list);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_roll_call);

        ListView listView = findViewById(R.id.lvStudents);
        listView.setAdapter(adapter);
    }

    public void onclick_result(View view) {
        Intent intent = new Intent(this,teacherActivity.class);
        startActivity(intent);
    }

    public void onclick_result_roll_call_export_file(View view) {
        Toast.makeText(this, "Đã Xuất File Thành Công!!!", Toast.LENGTH_SHORT).show();
    }
}