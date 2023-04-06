package com.example.moneyconvert;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Tempurature extends AppCompatActivity {

    EditText edit ;
    TextView result ;
    RadioGroup group ;
    RadioButton ctf , ftc ;
    Button convert ;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // connect java file and a layout xml file
        setContentView(R.layout.tempurature_conversion);

        edit = (EditText) findViewById(R.id.edit);
        result = (TextView) findViewById(R.id.result);
        ctf = (RadioButton) findViewById(R.id.ctf);
        ftc = (RadioButton) findViewById(R.id.ftc);
        convert = (Button) findViewById(R.id.convert);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ctf.isChecked()) {

                    CelciusToFarenheit();

                } else {
                    if (ftc.isChecked()){
                        FarenheitFoCelcius();
                    }
                }


            }
        });
    }
    public void FarenheitFoCelcius(){
        double value = Double.parseDouble(edit.getText().toString());
        result.setText("The result is : "+(value-32)*9/5);
    }
    public void CelciusToFarenheit(){
        double value = Double.parseDouble(edit.getText().toString());
        result.setText("The result is : "+9/5*value+32);
    }
}
