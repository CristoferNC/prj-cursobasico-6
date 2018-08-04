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

public class ComplexionWomenActivity extends AppCompatActivity{

    private DecimalFormat decimalFormat = new DecimalFormat("#");
    public EditText inputWomen;
    public EditText inputWomen2;
    public TextView tvWomen;
    public TextView decision;
    public TextView complexionR;
    public TextView textViewW2;
    public TextView textViewW3;
    public TextView textViewW4;
    public TextView textViewW5;
    public TextView textViewW6;
    public Button btnWomen;
    public double ftWomen;
    public double complexionWomenM;
    public double complexionWomenFt;
    public double  cm;
    public double formComplexion;
    public double formWomen;
    public Spinner spinner;
    public String  resultado;
    public String resultado2;
    public String prueba = "Su Complexion Es:";
    public String complexion;
    private Double[]  data = {1.50, 1.52, 1.54, 1.56, 1.58,
                             1.60, 1.62, 1.64, 1.66, 1.68,
                             1.70, 1.72, 1.74, 1.76, 1.78,
                             1.80, 1.82, 1.84, 1.86, 1.88,
                             1.90, 1.92, 1.94};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complexion_women);

        tvWomen = findViewById(R.id.informationWomen);
        inputWomen = findViewById(R.id.inputWomen);
        inputWomen2 = findViewById(R.id.input2Women);
        btnWomen = findViewById(R.id.btnWomen);
        spinner = findViewById(R.id.mySpinnerMen);
        decision = findViewById(R.id.complexionWomen);
        complexionR = findViewById(R.id.complexionWomenR);
        textViewW2 = findViewById(R.id.textGridWomen);
        textViewW3 = findViewById(R.id.obligationWomen);
        textViewW4 = findViewById(R.id.selectionWomen);
        textViewW5 = findViewById(R.id.ingresoAlturaWomen);
        textViewW6 = findViewById(R.id.ingresoCircunferenciaWomen);

        //Chagind Fonts
        textViewW2.setTypeface(MainActivity.NexaBold);
        textViewW3.setTypeface(MainActivity.NexaBold);
        textViewW4.setTypeface(MainActivity.NexaBold);
        textViewW5.setTypeface(MainActivity.NexaBold);
        textViewW6.setTypeface(MainActivity.NexaBold);
        complexionR.setTypeface(MainActivity.NexaBold);
        tvWomen.setTypeface(MainActivity.NexaLight);
        decision.setTypeface(MainActivity.NexaLight);

        /*---------Creating ArrayAdapter-------------*/
        ArrayAdapter<Double>adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, data);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        /*------------------------------------------*/


        //Button Action
        btnWomen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (inputWomen.length() == 0) {

                    inputWomen.setError("Ingrese Su Altura En Pies");

                } else if (inputWomen2.length() == 0) {

                    inputWomen2.setError("Ingrese La Circunferencia De Su Muñeca En Centimetros");

                } else {
                    operation2();
                    conversion();
                    if (formComplexion > 11) {
                        smallWomen();
                    } else if (formComplexion >= 10 && formComplexion <= 11) {
                        mediumWomen();
                    } else if (formComplexion < 10) {
                        largeWomen();
                    }
                    tvWomen.setText(resultado);
                    decision.setText(complexion);
                    complexionR.setText(prueba);
                }
            }
        });
    }

    public void conversion(){
        ftWomen  = Double.parseDouble(spinner.getSelectedItem().toString());
        formWomen = ftWomen ;
        resultado2 = String.valueOf(formWomen);
    }

    public void operation2(){
        complexionWomenFt = Double.parseDouble(inputWomen.getText().toString());
        complexionWomenM = Double.parseDouble(inputWomen2.getText().toString());

        cm = complexionWomenFt / 0.032808;
        formComplexion = cm / complexionWomenM;

        resultado = String.valueOf(decimalFormat.format(formComplexion));
    }

    public void smallWomen(){

        conversion();

            complexion = "Pequeña";

            if (ftWomen == 1.50) {
                resultado = "Su peso deberia estar entre 45.0 kilos y 47.2 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.52) {
                resultado = "Su peso deberia estar entre 46.2 kilos y 48.5 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.54) {
                resultado = "Su peso deberia estar entre 47.4 kilos y 49.8 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.56) {
                resultado = "Su peso deberia estar entre 48.7 kilos y 51.1 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.58) {
                resultado = "Su peso deberia estar entre 49.9 kilos y 52.4 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.60) {
                resultado = "Su peso deberia estar entre 51.2 kilos y 53.8 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.62) {
                resultado = "Su peso deberia estar entre 52.5 kilos y 55.1 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.64) {
                resultado = "Su peso deberia estar entre 53.8 kilos y 56.5 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.66) {
                resultado = "Su peso deberia estar entre 55.1 kilos y 57.9 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.68) {
                resultado = "Su peso deberia estar entre 56.4 kilos y 59.3 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.70) {
                resultado = "Su peso deberia estar entre 57.8 kilos y 60.7 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.72) {
                resultado = "Su peso deberia estar entre 59.2 kilos y 62.1 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.74) {
                resultado = "Su peso deberia estar entre 60.6 kilos y 63.6 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.76) {
                resultado = "Su peso deberia estar entre 62.0 kilos y 65.0 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.78) {
                resultado = "Su peso deberia estar entre 63.4 kilos y 66.5 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.80) {
                resultado = "Su peso deberia estar entre 64.8 kilos y 68.0 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.82) {
                resultado = "Su peso deberia estar entre 66.2 kilos y 69.6 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.84) {
                resultado = "Su peso deberia estar entre 67.7 kilos y 71.1 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.86) {
                resultado = "Su peso deberia estar entre 69.2 kilos y 72.7 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.88) {
                resultado = "Su peso deberia estar entre 70.7 kilos y 74.2 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.90) {
                resultado = "Su peso deberia estar entre 72.2 kilos y 75.8 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.92) {
                resultado = "Su peso deberia estar entre 73.7 kilos y 77.4 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.94) {
                resultado = "Su peso deberia estar entre 75.3 kilos y 79.0 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

    }

    public void mediumWomen(){

        conversion();

            complexion = "Mediana";

            if (ftWomen == 1.50) {
                resultado = "Su peso deberia estar entre 46.1 kilos y 50.6 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.52) {
                resultado = "Su peso deberia estar entre 47.4 kilos y 52.0 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.54) {
                resultado = "Su peso deberia estar entre 48.6 kilos y 53.4 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.56) {
                resultado = "Su peso deberia estar entre 49.9 kilos y 54.8 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.58) {
                resultado = "Su peso deberia estar entre 51.2 kilos y 56.2 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.60) {
                resultado = "Su peso deberia estar entre 52.5 kilos y 57.6 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.62) {
                resultado = "Su peso deberia estar entre 53.8 kilos y 59.0 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.64) {
                resultado = "Su peso deberia estar entre 55.1 kilos y 60.5 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.66) {
                resultado = "Su peso deberia estar entre 56.5 kilos y 62.0 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.68) {
                resultado = "Su peso deberia estar entre 57.9 kilos y 63.5 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.70) {
                resultado = "Su peso deberia estar entre 59.2 kilos y 65.0 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.72) {
                resultado = "Su peso deberia estar entre 60.6 kilos y 66.6 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.74) {
                resultado = "Su peso deberia estar entre 62.1 kilos y 68.1 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.76) {
                resultado = "Su peso deberia estar entre 63.5 kilos y 69.7 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.78) {
                resultado = "Su peso deberia estar entre 65.0 kilos y 71.3 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.80) {
                resultado = "Su peso deberia estar entre 66.4 kilos y 72.9 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.82) {
                resultado = "Su peso deberia estar entre 67.9 kilos y 74.5 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.84) {
                resultado = "Su peso deberia estar entre 69 kilos y 76.2 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.86) {
                resultado = "Su peso deberia estar entre 70.9 kilos y 77.8 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.88) {
                resultado = "Su peso deberia estar entre 72.5 kilos y 79.5 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.90) {
                resultado = "Su peso deberia estar entre 74.0 kilos y 81.2 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.92) {
                resultado = "Su peso deberia estar entre 75.6 kilos y 82.9 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.94) {
                resultado = "Su peso deberia estar entre 77.2 kilos y 84.7 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

    }

    public void largeWomen(){

        conversion();

            complexion = "Grande";

            if (ftWomen == 1.50) {

                resultado = "Su peso deberia estar entre 58.2 kilos y 52.9 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.52) {

                resultado = "Su peso deberia estar entre 48.5 kilos y 54.3 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.54) {
                resultado = "Su peso deberia estar entre 49.8 kilos y 55.7 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.56) {
                resultado = "Su peso deberia estar entre 51.1 kilos y 57.2 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.58 ) {
                resultado = "Su peso deberia estar entre 52.4 kilos y 58.7 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.60) {
                resultado = "Su peso deberia estar entre 53.8 kilos y 60.2 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.62) {
                resultado = "Su peso deberia estar entre 55.1 kilos y 57.2 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.64) {
                resultado = "Su peso deberia estar entre 56.5 kilos y 63.2 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.66) {
                resultado = "Su peso deberia estar entre 57.9 kilos y 64.8 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.68) {
                resultado = "Su peso deberia estar entre 59.3 kilos y 66.3 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.70) {
                resultado = "Su peso deberia estar entre 60.7 kilos y 67.9 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.72) {
                resultado = "Su peso deberia estar entre 62.1 kilos y 69.5 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.74) {
                resultado = "Su peso deberia estar entre 63.6 kilos y 71.1 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.76) {
                resultado = "Su peso deberia estar entre 65.0 kilos y 72.8 kilos para estar en su peso ideal";
            }

            /*---------------------------------------------*/

            else if (ftWomen == 1.78) {
                resultado = "Su peso deberia estar entre 66.5 kilos y 74.5 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.80) {
                resultado = "Su peso deberia estar entre 68.0 kilos y 76.1 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.82) {
                resultado = "Su peso deberia estar entre 69.6 kilos y 77.8 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.84) {
                resultado = "Su peso deberia estar entre 71.1 kilos y 89.6 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.86) {
                resultado = "Su peso deberia estar entre 72.7 kilos y 81.3 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.88) {
                resultado = "Su peso deberia estar entre 74.2 kilos y 83.1 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.90) {
                resultado = "Su peso deberia estar entre 75.8 kilos y 84.8 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.92) {
                resultado = "Su peso deberia estar entre 77.4 kilos y 86.6 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

            else if (ftWomen == 1.94) {
                resultado = "Su peso deberia estar entre 79.0 kilos y 88.4 kilos para estar en su peso ideal";
            }
            /*---------------------------------------------*/

    }



}
