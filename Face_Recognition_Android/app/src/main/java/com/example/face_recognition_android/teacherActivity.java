package com.example.face_recognition_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class teacherActivity extends AppCompatActivity {

    Intent intent = getIntent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);
    }

    public void onclick_rollcall(View view) {
        Intent intent = new Intent(this, inputrollcallActivity.class);
        startActivity(intent);
    }

    public void onclick_teacher_exportfile(View view) {
        Intent intent = new Intent(this, ExportFileActivity.class);
        startActivity(intent);
    }
}