package com.example.face_recognition_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class rollcallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rolllcall);

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("data");
        String className = bundle.getString("classes");
        TextView tvChoseClass = findViewById(R.id.tvChoseClass);
        tvChoseClass.setText(className);
    }

    public void onclick_PerfectRollCall(View view) {
        Intent intent = new Intent(this, ResultRollCallActivity.class);
        startActivity(intent);
    }

    public void onclick_BackRollCall(View view) {
        Intent intent = new Intent(this, inputrollcallActivity.class);
        startActivity(intent);
    }
}