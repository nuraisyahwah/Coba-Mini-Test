package com.if3a.minikuis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnbutton ;
    EditText etcobaminitest ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Layout Satu");

        btnbutton = findViewById(R.id.btn_Button);

        btnbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cobaminitest = etcobaminitest.getText().toString();

                if (cobaminitest.trim().equals("")) {
                    etcobaminitest.setError("Coba Mini Test");
                }
                else {

                }
            }
        });

    }
}