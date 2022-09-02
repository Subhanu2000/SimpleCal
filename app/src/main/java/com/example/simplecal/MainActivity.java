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

    //int answer = 0;

    public void calculate (View v){

        String tag = v.getTag().toString();
        lblAnswer.setText(tag);

        String  value1 = txtValue1.getText().toString();
        String  value2 = txtValue2.getText().toString();

        Double x = Double.parseDouble(value1);
        Double y = Double.parseDouble(value2);

        double answer = 0;

        switch (tag){
            case "Sum" : answer = x+y; break;
            case "Sub" : answer = x-y; break;
            case "Mul" : answer = x*y; break;
            case "Div" : answer = x/y; break;
        }

//        if (tag.equals("Sum")){
//            answer = x+y;
//        }
//
//        if (tag.equals("Sub")){
//            answer = x-y;
//        }
//
//        if (tag.equals("Mul")){
//            answer = x*y;
//        }
//
//        if (tag.equals("Div")){
//            answer = x/y;
//        }


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
    }*/
    public void resetcount (View v){

        int answer = 0;

        lblAnswer.setText(""+answer);
        txtValue1.setText("");
        txtValue2.setText("");
    }

}