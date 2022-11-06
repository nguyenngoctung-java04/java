package com.example.face_recognition_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class inputrollcallActivity extends AppCompatActivity {
    Intent intent = getIntent();
    private Spinner spnClasses;
    String ClassName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inputrollcall);

        Intent intent = getIntent();

        spnClasses = findViewById(R.id.spnChooseClass);

        ArrayList<String> array = new ArrayList<>();
        array.add("19DTV3A");
        array.add("19DTV3B");
        array.add("19DTV3C");
        array.add("CNTT1");
        array.add("CNTT2");

        ArrayAdapter adapter = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, array);
        spnClasses.setAdapter(adapter);
//Xử lí sự kiện khi click vào item:
        spnClasses.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                ClassName = array.get(position);
//                Intent intent1 = new Intent(inputrollcallActivity.this, rollcallActivity.class);
//                Bundle bundle1 = new Bundle();
//                bundle1.putString("classes", ClassName);
//                intent1.putExtra("data",bundle1);
//                startActivity(intent1);
                Toast.makeText(inputrollcallActivity.this,"you chose class: " + ClassName, Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    public void onclick_InputBackRollCall(View view) {
        Intent intent = new Intent(this, teacherActivity.class);
        startActivity(intent);
    }
    public void Onclick_StartRollCall(View view) {
        Intent intent1 = new Intent(this, rollcallActivity.class);
        Bundle bundle1 = new Bundle();
        bundle1.putString("classes", ClassName);
        intent1.putExtra("data",bundle1);
        startActivity(intent1);
    }
}