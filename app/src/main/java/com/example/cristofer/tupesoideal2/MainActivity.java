package com.example.cristofer.tupesoideal2;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public TextView title;
    public TextView tvCardView1;
    public TextView tvCardView2;
    public TextView tvCardView3;
    public TextView tvCardView4;

    //Declaring the fonts
    public static Typeface NexaBold;
    public static Typeface NexaLight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ID
        title = findViewById(R.id.textGrid);
        tvCardView1 = findViewById(R.id.tvCardView1);
        tvCardView2 = findViewById(R.id.tvCardView2);
        tvCardView3 = findViewById(R.id.tvCardView3);
        tvCardView4 = findViewById(R.id.tvCardView4);
        /*-----------------------------------------*/


        //Fiding the Fonts
        String fuenteNB = "fonts/NexaBold.otf";
        String fuenteNL = "fonts/NexaLight.otf";


        //Declarand the fonts
        MainActivity.NexaBold = Typeface.createFromAsset(getAssets(), fuenteNB);
        MainActivity.NexaLight = Typeface.createFromAsset(getAssets(), fuenteNL);


        //Adding the fonts to the text
        title.setTypeface(NexaBold);
        tvCardView1.setTypeface(NexaBold);
        tvCardView2.setTypeface(NexaBold);
        tvCardView3.setTypeface(NexaBold);
        tvCardView4.setTypeface(NexaBold);

        init();

    }

    public void init(){
        findViewById(R.id.cardViewPlay).setOnClickListener(this);
        findViewById(R.id.cardViewGrid).setOnClickListener(this);
        findViewById(R.id.cardViewConvertion).setOnClickListener(this);
        findViewById(R.id.cardViewExit).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.cardViewPlay:
                startActivity(new Intent(this, ElectionActivity.class));
                break;

            case R.id.cardViewGrid:
                startActivity(new Intent(this, FrameLayoutActivity.class));
                break;

            case R.id.cardViewConvertion:
                startActivity(new Intent(this, ConversionActivity.class));
                break;

            case R.id.cardViewExit:
                    AlertDialog alert = new AlertDialog.Builder(this)
                            .setTitle("")
                            .setMessage("Seguro que Quieres Salir")
                            .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                    System.exit(0);
                                }
                            })

                            .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            }) .create(); alert.show();
                break;

        }
    }
}
