package com.example.pr_10_clock;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

//import com.example.pr_10_clock.databinding.ActivityMainBinding;

public class Table extends AppCompatActivity implements View.OnClickListener {
    ImageView borsh;
    @SuppressLint("MissingInflatedId")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        borsh = findViewById(R.id.borsh);
        borsh.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, ShowItems.class);
        startActivity(intent);
    }
}
