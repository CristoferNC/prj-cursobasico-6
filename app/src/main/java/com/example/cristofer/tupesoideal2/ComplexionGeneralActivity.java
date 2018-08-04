package com.example.cristofer.tupesoideal2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ComplexionGeneralActivity extends AppCompatActivity implements View.OnClickListener{

    public TextView electionGender;
    public TextView titleElectionGender;
    public TextView tvMan;
    public TextView tvWomen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complexion_general);

        findViewById(R.id.GenderTvCardView1).setOnClickListener(this);
        findViewById(R.id.GenderTvCardView2).setOnClickListener(this);
        electionGender = findViewById(R.id.selectionGender);
        titleElectionGender = findViewById(R.id.textGridGender);
        tvMan = findViewById(R.id.GenderTvCardView1);
        tvWomen = findViewById(R.id.GenderTvCardView2);

        electionGender.setTypeface(MainActivity.NexaBold);
        titleElectionGender.setTypeface(MainActivity.NexaBold);
        tvMan.setTypeface(MainActivity.NexaBold);
        tvWomen.setTypeface(MainActivity.NexaBold);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.GenderTvCardView1:
                startActivity(new Intent(this, ComplexionMenActivity.class));
                break;

            case R.id.GenderTvCardView2:
                startActivity(new Intent(this, ComplexionWomenActivity.class));
                break;

        }
    }
}
