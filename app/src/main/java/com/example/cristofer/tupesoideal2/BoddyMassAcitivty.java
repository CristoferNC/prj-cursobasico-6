package com.example.cristofer.tupesoideal2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BoddyMassAcitivty extends AppCompatActivity {

    public TextView textView;
    public TextView textView2B;
    public TextView textView3B;
    public TextView textView4B;
    public TextView textView5B;
    public TextView textView6B;
    public Button boton;
    public EditText inputEditText, inputEditText2;
    double mt;
    double kg;
    double formula;
    String result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boddy_mass_acitivty);

        inputEditText = findViewById(R.id.input);
        inputEditText2 = findViewById(R.id.input2);
        textView = findViewById(R.id.resultadoBody);
        boton = findViewById(R.id.boton);
        textView2B = findViewById(R.id.textGrid3);
        textView3B = findViewById(R.id.obligationBoddyMass);
        textView4B = findViewById(R.id.ingresoAlturaBoddyMass);
        textView5B = findViewById(R.id.ingresoKgBoddyMass);
        textView6B = findViewById(R.id.resultadoTvBoddyMass);

        //Chagind Fonts
        textView.setTypeface(MainActivity.NexaLight);
        textView2B.setTypeface(MainActivity.NexaBold);
        textView3B.setTypeface(MainActivity.NexaBold);
        textView4B.setTypeface(MainActivity.NexaBold);
        textView5B.setTypeface(MainActivity.NexaBold);
        textView6B.setTypeface(MainActivity.NexaBold);

        /*---------------------------------------------------*/
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation();
                textView.setText(result);
            }
        });
    }

    public void operation(){
        mt = Double.parseDouble(inputEditText.getText().toString());
        kg = Double.parseDouble(inputEditText2.getText().toString());

        formula = kg/(mt*mt);

        if(formula < 18.5){
            //TODO Peso Insuficiente
            result = "Peso Insuficiente";
        } else if (formula >=18.5 && formula <= 24.9){
            //TODO Perso normal, Peso Ideal
            result = "Peso Ideal";
        } else if(formula >=25 && formula <=26.9){
            //TODO SobrePeso grado 1
            result = "Sobrepeso grado 1";
        } else if(formula >=27 && formula <=29.9){
            //TODO Sobrepeso tipo 1 (preobecidad)
            result = "Pre-Obecidad";
        } else if(formula >=30 && formula <= 34.9){
            //TODO Obecidad tipo 1 (leve)
            result = "Obecidad Leve";
        } else if(formula >=35 && formula <= 39.9){
            //TODO Obecidad tipo 2 (Moderada)
            result = "Obecidad Moderada";
        } else if(formula >= 40 && formula <=49.9){
            //TODO Obecidad tipo 3 (Morbida)
            result = "Obecidad Morbida";
        } else if(formula >= 50){
            //TODO Obecidad Extrema
            result = "Obecidad Extrema";
        }
    }
}
