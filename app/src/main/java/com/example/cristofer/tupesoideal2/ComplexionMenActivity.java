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

public class ComplexionMenActivity extends AppCompatActivity{

    public EditText inputMen;
    public EditText inputMen2;
    public TextView tvMen;
    public TextView decisionMen;
    public TextView complexionR;
    public TextView textViewM2;
    public TextView textViewM3;
    public TextView textViewM4;
    public TextView textViewM5;
    public TextView textViewM6;
    private Spinner spinnerMen;
    public double complexionMenM;
    public double complexionMenFt;
    public double formComplexionMen;
    public Button btnMen;
    public double ft;
    public double  cm;
    public double form;
    public String  resultado;
    public String resultadoMen2;
    public String complexionMen;
    public String prueba = "Su Complexion Es:";
    DecimalFormat decimalFormat = new DecimalFormat("#");
    private Double[]  data = {1.50, 1.52, 1.54, 1.56, 1.58,
                              1.60, 1.62, 1.64, 1.66, 1.68,
                              1.70, 1.72, 1.74, 1.76, 1.78,
                              1.80, 1.82, 1.84, 1.86, 1.88,
                              1.90, 1.92, 1.94};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complexion_men);

        inputMen = findViewById(R.id.inputMen);
        inputMen2 = findViewById(R.id.inputMen2);
        btnMen = findViewById(R.id.btnMen);
        tvMen = findViewById(R.id.informationMen);
        decisionMen = findViewById(R.id.complexionMen);
        spinnerMen = findViewById(R.id.mySpinnerMen1);
        complexionR = findViewById(R.id.complexionMenR);
        textViewM2 = findViewById(R.id.textGridMen);
        textViewM3 = findViewById(R.id.obligationMen);
        textViewM4 = findViewById(R.id.selectionMen);
        textViewM5 = findViewById(R.id.ingresoAlturaMen);
        textViewM6 = findViewById(R.id.ingresoCircunferenciaMen);

        //Changind Fonts
        textViewM2.setTypeface(MainActivity.NexaBold);
        textViewM3.setTypeface(MainActivity.NexaBold);
        textViewM4.setTypeface(MainActivity.NexaBold);
        textViewM5.setTypeface(MainActivity.NexaBold);
        textViewM6.setTypeface(MainActivity.NexaBold);
        complexionR.setTypeface(MainActivity.NexaBold);
        tvMen.setTypeface(MainActivity.NexaLight);
        decisionMen.setTypeface(MainActivity.NexaLight);



        /*-----------Creating Array------------*/
        ArrayAdapter<Double> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, data);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMen.setAdapter(adapter);
        /*------------------------------------*/


        //Button Action
        btnMen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    if(inputMen.length() == 0){

                        inputMen.setError("Ingrese Su Altura En Pies");

                    } else if(inputMen2.length() == 0){

                        inputMen2.setError("Ingrese La Circunferencia De Su Muñeca");

                    } else {

                        operation2();
                        conversion();
                        if (formComplexionMen > 10.4) {
                            small();
                        } else if (formComplexionMen >= 9.6 && formComplexionMen <= 10.4) {
                            medium();
                        } else if (formComplexionMen < 9.6) {
                            large();
                        }
                        tvMen.setText(resultado);
                        decisionMen.setText(complexionMen);
                        complexionR.setText(prueba);

                    }
                }
        });
    }

    public void conversion(){
        ft  = Double.parseDouble(spinnerMen.getSelectedItem().toString());
        form = ft ;
        resultadoMen2 = String.valueOf(form);
    }

    public void operation2(){
        complexionMenFt = Double.parseDouble(inputMen.getText().toString());
        complexionMenM = Double.parseDouble(inputMen2.getText().toString());

        cm = complexionMenFt / 0.032808;
        formComplexionMen = cm / complexionMenM;

        resultado = String.valueOf(decimalFormat.format(formComplexionMen));
    }

    public void small(){

        conversion();

        complexionMen = "Pequeña";

        if (ft == 1.50){
            resultado = "Su peso deberia estar entre 45.0 kilos y 50.2 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.52){
            resultado = "Su peso deberia estar entre 46.2 kilos y 51.5 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.54){
            resultado = "Su peso deberia estar entre 47.4 kilos y 52.9 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.56){
            resultado = "Su peso deberia estar entre 48.7 kilos y 54.3 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.58){
            resultado = "Su peso deberia estar entre 49.9 kilos y 55.7 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.60){
            resultado = "Su peso deberia estar entre 51.2 kilos y 57.1 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.62){
            resultado = "Su peso deberia estar entre 52.5 kilos y 58.5 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.64){
            resultado = "Su peso deberia estar entre 53.8 kilos y 60.0 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.66){
            resultado = "Su peso deberia estar entre 55.1 kilos y 61.4 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.68){
            resultado = "Su peso deberia estar entre 56.4 kilos y 62.9 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.70){
            resultado = "Su peso deberia estar entre 57.8 kilos y 64.4 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.72){
            resultado = "Su peso deberia estar entre 59.2 kilos y 66.0 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        if (ft == 1.74){
            resultado = "Su peso deberia estar entre 60.6 kilos y 67.5 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.76){
            resultado = "Su peso deberia estar entre 62.0 kilos y 69.1 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.78){
            resultado = "Su peso deberia estar entre 63.4 kilos y 70.7 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.80){
            resultado = "Su peso deberia estar entre 64.8 kilos y 72.3 kilos para estar en su peso ideal";
        }

        /*---------------------------------------------*/

        else if (ft == 1.82){
            resultado = "Su peso deberia estar entre 66.2 kilos y 73.9 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.84){
            resultado = "Su peso deberia estar entre 67.7 kilos y 75.5 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.86){
            resultado = "Su peso deberia estar entre 69.2 kilos y 77.1 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.88){
            resultado = "Su peso deberia estar entre 70.7 kilos y 78.8 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.90){
            resultado = "Su peso deberia estar entre 72.2 kilos y 80.5 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.92){
            resultado = "Su peso deberia estar entre 73.7 kilos y 82.2 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.94){
            resultado = "Su peso deberia estar entre 75.3 kilos y 83.9 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

    }

    public void medium(){

        conversion();

        complexionMen = "Mediana";

        if (ft == 1.50){
            resultado = "Su peso deberia estar entre 48.4 kilos y 55.4 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.52){
            resultado = "Su peso deberia estar entre 49.7 kilos y 56.9 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.54){
            resultado = "Su peso deberia estar entre 51.0 kilos y 58.4 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.56){
            resultado = "Su peso deberia estar entre 52.3 kilos y 59.9 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.58){
            resultado = "Su peso deberia estar entre 53.7 kilos y 61.5 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.60){
            resultado = "Su peso deberia estar entre 55.0 kilos y 63.0 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.62){
            resultado = "Su peso deberia estar entre 56.4 kilos y 64.6 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.64){
            resultado = "Su peso deberia estar entre 57.8 kilos y 66.2 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.66){
            resultado = "Su peso deberia estar entre 59.2 kilos y 67.8 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.68){
            resultado = "Su peso deberia estar entre 60.7 kilos y 69.5 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.70){
            resultado = "Su peso deberia estar entre 62.1 kilos y 71.2 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.72){
            resultado = "Su peso deberia estar entre 63.6 kilos y 72.8 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.74){
            resultado = "Su peso deberia estar entre 65.1 kilos y 74.5 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.76){
            resultado = "Su peso deberia estar entre 66.6 kilos y 76.3 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.78){
            resultado = "Su peso deberia estar entre 68.1 kilos y 78.0 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.80){
            resultado = "Su peso deberia estar entre 69.4 kilos y 79.8 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.82){
            resultado = "Su peso deberia estar entre 71.2 kilos y 81.6 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.84){
            resultado = "Su peso deberia estar entre 72.8 kilos y 83.4 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.86){
            resultado = "Su peso deberia estar entre 74.4 kilos y 85.2 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.88){
            resultado = "Su peso deberia estar entre 76.0 kilos y 87.0 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.90){
            resultado = "Su peso deberia estar entre 77.6 kilos y 88.9 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.92){
            resultado = "Su peso deberia estar entre 79.3 kilos y 90.8 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.94){
            resultado = "Su peso deberia estar entre 80.9 kilos y 92.7 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

    }

    public void large(){

        conversion();

        complexionMen = "Grande";

        if (ft == 1.50){
            resultado = "Su peso deberia estar entre 50.6 kilos y 56.2 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.52){
            resultado = "Su peso deberia estar entre 52.0 kilos y 57.8 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.54){
            resultado = "Su peso deberia estar entre 53.4 kilos y 59.3 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.56){
            resultado = "Su peso deberia estar entre 54.8 kilos y 60.8 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.58){
            resultado = "Su peso deberia estar entre 56.2 kilos y 62.4 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.60){
            resultado = "Su peso deberia estar entre 57.6 kilos y 64.0 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.62){
            resultado = "Su peso deberia estar entre 59.0 kilos y 65.6 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.64){
            resultado = "Su peso deberia estar entre 60.5 kilos y 67.2 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.66){
            resultado = "Su peso deberia estar entre 62.0 kilos y 68.9 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.68){
            resultado = "Su peso deberia estar entre 63.5 kilos y 70.6 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.70){
            resultado = "Su peso deberia estar entre 65.0 kilos y 72.3 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.72){
            resultado = "Su peso deberia estar entre 66.6 kilos y 74.0 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.74){
            resultado = "Su peso deberia estar entre 68.1 kilos y 75.7 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.76){
            resultado = "Su peso deberia estar entre 69.7 kilos y 77.4 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.78){
            resultado = "Su peso deberia estar entre 71.3 kilos y 79.2 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.80){
            resultado = "Su peso deberia estar entre 72.9 kilos y 81.0 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.82){
            resultado = "Su peso deberia estar entre 74.5 kilos y 82.8 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.84){
            resultado = "Su peso deberia estar entre 76.2 kilos y 84.6 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.86){
            resultado = "Su peso deberia estar entre 77.8 kilos y 86.5 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.88){
            resultado = "Su peso deberia estar entre 79.5 kilos y 88.4 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.90){
            resultado = "Su peso deberia estar entre 81.2 kilos y 90.3 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft == 1.92){
            resultado = "Su peso deberia estar entre 82.9 kilos y 92.2 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

        else if (ft ==1.94){
            resultado = "Su peso deberia estar entre 84.7 kilos y 94.1 kilos para estar en su peso ideal";
        }
        /*---------------------------------------------*/

    }

}
