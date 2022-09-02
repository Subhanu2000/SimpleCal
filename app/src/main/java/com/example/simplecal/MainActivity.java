package com.example.simplecal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtValue1;
    EditText txtValue2;
    TextView lblAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtValue1 = findViewById(R.id.txtValue1);
        txtValue2 = findViewById(R.id.txtValue2);
        lblAnswer = findViewById(R.id.lblAnswer);
    }

    public void calculate (View v){

        String  value1 = txtValue1.getText().toString();
        String  value2 = txtValue2.getText().toString();

        Double x = Double.parseDouble(value1);
        Double y = Double.parseDouble(value2);

        Double answer = (x+y);


        lblAnswer.setText(""+answer);
    }
    /*
    public void substraction (View v){

        String  value1 = txtValue1.getText().toString();
        String  value2 = txtValue2.getText().toString();

        Double x = Double.parseDouble(value1);
        Double y = Double.parseDouble(value2);

        Double answer = (x-y);

        lblAnswer.setText(""+answer);
    }
    public void Multipication (View v){

        String  value1 = txtValue1.getText().toString();
        String  value2 = txtValue2.getText().toString();

        Double x = Double.parseDouble(value1);
        Double y = Double.parseDouble(value2);

        Double answer = (x*y);

        lblAnswer.setText(""+answer);
    }
    public void Divition (View v){

        String  value1 = txtValue1.getText().toString();
        String  value2 = txtValue2.getText().toString();

        Double x = Double.parseDouble(value1);
        Double y = Double.parseDouble(value2);

        Double answer = (x/y);

        lblAnswer.setText(""+answer);
    } */
    public void resetcount (View v){

        answer = 0;

        lblAnswer.setText(""+answer);
        txtValue1.setText("");
        txtValue2.setText("");
    }

}