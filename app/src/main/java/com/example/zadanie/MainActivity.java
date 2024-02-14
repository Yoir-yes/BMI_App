package com.example.zadanie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.buton);

        button.setOnClickListener((View view ) -> {
            EditText data1 = findViewById(R.id.waga);
            EditText data2 = findViewById(R.id.wzrost);
            double waga = Double.parseDouble(data1.getText().toString());
            double wzrost = Double.parseDouble(data2.getText().toString());
            double wzrostmetr = (wzrost/100);

            double BMI = waga/(wzrostmetr*wzrostmetr);
            String st = String.format("%1$,.2f", BMI);

            TextView tak = findViewById(R.id.Odpowiedz);
            if (BMI<18.5){
                tak.setText("Twoja BMI to " +   st + " niedowaga");
            }
            if(BMI>18.5&& BMI<25){
                tak.setText("Twoja BMI to " +   st + " norma");
            }
            if(BMI>25 && BMI<30){
                tak.setText("Twoja BMI to " +   st + " nadwaga");
            }
            if(BMI>30){
                tak.setText("Twoja BMI to " +   st + " otyłość");
            }
        });
    }
}