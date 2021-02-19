package com.example.e_reserve.all_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.e_reserve.R;
import com.example.e_reserve.activity2;

public class activity_pharmacy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharmacy);

        //back buton array
        ImageButton backtomain_pharmacy = (ImageButton) findViewById(R.id.backtomain_pharmacy);
        backtomain_pharmacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(activity_pharmacy.this, activity2.class );
                startActivity(intent2);
            }
        });
    }
}