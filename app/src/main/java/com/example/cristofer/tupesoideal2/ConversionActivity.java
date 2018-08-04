package com.example.cristofer.tupesoideal2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import java.text.DecimalFormat;

public class ConversionActivity extends AppCompatActivity {

    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    public Spinner spinnerConversion;
    public TextView tvResultado;
    public TextView tvTitle;
    public  TextView textView;
    public TextView textView2;
    public TextView textView3;
    public TextView textView4;
    public EditText inputConversion;
    public Button btnConversion;
    public String resultConversionS;
    public double operation;
    public double resultadoConversion;
    private String[]  dataS = {"Pies a Metros", "Pies a Centimetros", "Metros a Centimetros"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion);

        spinnerConversion = findViewById(R.id.mySpinnerConversion);
        btnConversion = findViewById(R.id.btnConversion);
        inputConversion = findViewById(R.id.inputConversion1);
        tvResultado = findViewById(R.id.tvResultado);
        tvTitle = findViewById(R.id.textGridConversion);
        textView = findViewById(R.id.ingresoConversion);
        textView2 = findViewById(R.id.selectionConversion);
        textView3 = findViewById(R.id.obligationConversion);
        textView4 = findViewById(R.id.R);

        //Changing the Fonts
        tvTitle.setTypeface(MainActivity.NexaBold);
        textView.setTypeface(MainActivity.NexaBold);
        textView2.setTypeface(MainActivity.NexaBold);
        textView3.setTypeface(MainActivity.NexaBold);
        tvResultado.setTypeface(MainActivity.NexaLight);


        /*----------Creating Array-------------*/
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, dataS);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerConversion.setAdapter(adapter);
        /*------------------------------------*/


        //Button Action
        btnConversion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputConversion.length() == 0){
                    inputConversion.setError("Ingrese la cantidad que desea convertir");
                } else {

                    if (spinnerConversion.getSelectedItem() == "Pies a Metros") {
                        conversioFt_M();
                    } else if (spinnerConversion.getSelectedItem() == "Pies a Centimetros") {
                        conversioFt_Cm();
                    } else if (spinnerConversion.getSelectedItem() == "Metros a Centimetros") {

                        conversionM_Cm();
                    }
                }
            }

        });


    }

    public void conversioFt_M(){
        resultadoConversion = Double.parseDouble(inputConversion.getText().toString());
        operation = resultadoConversion / 3.2808;
        resultConversionS = String.valueOf(decimalFormat.format(operation));
        tvResultado.setText(resultConversionS);
    }

    public void conversioFt_Cm(){
        resultadoConversion = Double.parseDouble(inputConversion.getText().toString());
        operation = resultadoConversion / 0.032808;
        resultConversionS = String.valueOf(decimalFormat.format(operation));
        tvResultado.setText(resultConversionS);
    }

    public void conversionM_Cm(){
        resultadoConversion = Double.parseDouble(inputConversion.getText().toString());
        operation = resultadoConversion * 100;
        resultConversionS = String.valueOf(decimalFormat.format(operation));
        tvResultado.setText(resultConversionS);
    }
}
