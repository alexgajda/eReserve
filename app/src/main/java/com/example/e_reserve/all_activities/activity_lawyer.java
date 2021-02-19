package com.example.e_reserve.all_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.e_reserve.R;
import com.example.e_reserve.activity2;

public class activity_lawyer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lawyer);

        //back buton array
        ImageButton backtomain_lawyer = (ImageButton) findViewById(R.id.backtomain_lawyer);
        backtomain_lawyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(activity_lawyer.this, activity2.class );
                startActivity(intent2);
            }
        });

    }
}