package com.example.cristofer.tupesoideal2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ElectionActivity extends AppCompatActivity implements View.OnClickListener{

    public TextView textView1;
    public TextView textView2;
    public TextView electionTitle;
    public TextView method;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_election);

        textView1 = findViewById(R.id.ElectionTvCardView1);
        textView2 = findViewById(R.id.ElectionTvCardView2);
        electionTitle = findViewById(R.id.textGrid2);
        method = findViewById(R.id.selection);

        electionTitle.setTypeface(MainActivity.NexaBold);
        textView1.setTypeface(MainActivity.NexaBold);
        textView2.setTypeface(MainActivity.NexaBold);
        method.setTypeface(MainActivity.NexaBold);

        init();
    }

    public void init(){
        findViewById(R.id.ElectionTvCardView1).setOnClickListener(this);
        findViewById(R.id.ElectionTvCardView2).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ElectionTvCardView1:
                startActivity(new Intent(this, BoddyMassAcitivty.class));
                break;

            case R.id.ElectionTvCardView2:
                startActivity(new Intent(this, ComplexionGeneralActivity.class));
                break;
        }
    }
}
