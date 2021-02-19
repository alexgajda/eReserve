package com.example.e_reserve.all_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.e_reserve.MainActivity;
import com.example.e_reserve.R;
import com.example.e_reserve.activity2;

public class activity_barber extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barber);

        //back buuton array
        ImageButton backtomain_barber = (ImageButton) findViewById(R.id.backtomain_barber);
        backtomain_barber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(activity_barber.this, activity2.class );
                startActivity(intent2);
            }
        });


    }
}