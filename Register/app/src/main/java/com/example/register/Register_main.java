package com.example.register;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class Register_main extends AppCompatActivity {
    public Button button,button1;
    public EditText password;
    public CheckBox checkBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_main);


        password=(EditText)findViewById(R.id.editPassword);
        button=(Button)findViewById(R.id.manager);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Register_main.this,"You have successfully registered",Toast.LENGTH_SHORT).show();

            }
        });

        button1=(Button)findViewById(R.id.lecture);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Register_main.this,"You have successfully registered",Toast.LENGTH_SHORT).show();
            }
        });

        checkBox=findViewById(R.id.hienmatkhau);
        password=(EditText)findViewById(R.id.editPassword);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());

                } else {
                    password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });

}
}
