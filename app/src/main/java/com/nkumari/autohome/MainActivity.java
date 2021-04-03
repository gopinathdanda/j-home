package com.nkumari.autohome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mOn;
    Button mOff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mOn = findViewById(R.id.turnOn);
        mOff = findViewById(R.id.turnOff);

        mOn.setOnClickListener(v -> Toast.makeText(MainActivity.this, "Light turned ON!", Toast.LENGTH_SHORT).show());
        mOff.setOnClickListener(v -> Toast.makeText(MainActivity.this, "Light turned OFF!", Toast.LENGTH_SHORT).show());
    }
}