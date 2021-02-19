package com.example.e_reserve;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.e_reserve.all_activities.activity_barber;
import com.example.e_reserve.all_activities.activity_caffe;
import com.example.e_reserve.all_activities.activity_cinema;
import com.example.e_reserve.all_activities.activity_club;
import com.example.e_reserve.all_activities.activity_doctor;
import com.example.e_reserve.all_activities.activity_engineer;
import com.example.e_reserve.all_activities.activity_freetime;
import com.example.e_reserve.all_activities.activity_gas_station;
import com.example.e_reserve.all_activities.activity_lawyer;
import com.example.e_reserve.all_activities.activity_pharmacy;
import com.example.e_reserve.all_activities.activity_tatoo;
import com.example.e_reserve.all_activities.activity_theater;

public class activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        //back buuton array
        ImageButton backtomain = (ImageButton) findViewById(R.id.backtomain);
        backtomain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(activity2.this, MainActivity.class );
                startActivity(intent2);
            }
        });

        //caffeteria
        Button b_caffe = (Button) findViewById(R.id.b_caffe);
        b_caffe.setOnClickListener(v -> {
            Intent intent = new Intent(this, activity_caffe.class);
            startActivity(intent);
            overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out);
        });

        //theater
        Button b_theater = (Button) findViewById(R.id.b_Theater);
        b_theater.setOnClickListener(v -> {
            Intent intent = new Intent(this, activity_theater.class);
            startActivity(intent);
            overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out);
        });

        //lawyer
        Button b_lawyer = (Button) findViewById(R.id.b_freetime);
        b_lawyer.setOnClickListener(v -> {
            Intent intent = new Intent(this, activity_lawyer.class);
            startActivity(intent);
            overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out);
        });

        //cinema
        Button b_cinema = (Button) findViewById(R.id.b_cinema);
        b_cinema.setOnClickListener(v -> {
            Intent intent = new Intent(this, activity_cinema.class);
            startActivity(intent);
            overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out);
        });

        //free time
        Button b_freetime = (Button) findViewById(R.id.b_lawyer);
        b_freetime.setOnClickListener(v -> {
            Intent intent = new Intent(this, activity_freetime.class);
            startActivity(intent);
            overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out);
        });

        //doctor
        Button b_doctor = (Button) findViewById(R.id.b_doctor);
        b_doctor.setOnClickListener(v -> {
            Intent intent = new Intent(activity2.this, activity_doctor.class);
            startActivity(intent);
            overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out);
        });

        //barber
        Button b_barber = (Button) findViewById(R.id.b_barber);
        b_barber.setOnClickListener(v -> {
            Intent intent = new Intent(this, activity_barber.class);
            startActivity(intent);
            overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out);
        });

        //gas station
        Button b_gastation = (Button) findViewById(R.id.b_gasstation);
        b_gastation.setOnClickListener(v -> {
            Intent intent = new Intent(this, activity_gas_station.class);
            startActivity(intent);
            overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out);
        });

        //engineer
        Button b_engineer = (Button) findViewById(R.id.b_engineer);
        b_engineer.setOnClickListener(v -> {
            Intent intent = new Intent(this, activity_engineer.class);
            startActivity(intent);
            overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out);
        });

        //tatoo
        Button b_tatoo = (Button) findViewById(R.id.b_tatoo);
        b_tatoo.setOnClickListener(v -> {
            Intent intent = new Intent(this, activity_tatoo.class);
            startActivity(intent);
            overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out);
        });

        //pharmacy
        Button b_pharmacy = (Button) findViewById(R.id.b_pharmacy);
        b_pharmacy.setOnClickListener(v -> {
            Intent intent = new Intent(this, activity_pharmacy.class);
            startActivity(intent);
            overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out);
        });

        //club
        Button b_club = (Button) findViewById(R.id.b_club);
        b_club.setOnClickListener(v -> {
            Intent intent = new Intent(this, activity_club.class);
            startActivity(intent);
            overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out);
        });

    }
}
