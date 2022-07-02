package com.example.personalhealthmonitoringapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.personalhealthmonitoringapp.R;

public class Osteobreakfast extends AppCompatActivity {
    TextView H, TC, DS;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_osteobreakfast);
        H = (TextView) findViewById(R.id.head1);
        TC = (TextView) findViewById(R.id.cal1);
        DS = (TextView) findViewById(R.id.des1);
        img = (ImageView) findViewById(R.id.img1);
    }
}