package com.example.moneyconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editnember ;
    TextView result ;

    RadioButton etd ,dte;
    Button convert ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editnember=findViewById(R.id.editTextNumber);
        result =findViewById(R.id.ruslt);
        etd =findViewById(R.id.etd);
        dte =findViewById(R.id.dte);
        convert =findViewById(R.id.button);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etd.isChecked()) {
                    EuroToDinar();


                } else {
                    if (dte.isChecked()) {
                        EuroToDinar2();
                    }
                }
            }
        });
    }
    public void EuroToDinar(){
        double value = Double.parseDouble(editnember.getText().toString()) ;
        result.setText("result :"+(value*200)+" DA" );


    }
    public void EuroToDinar2(){
        double value = Double.parseDouble(editnember.getText().toString()) ;
        result.setText("result :"+(value*0.005)+" Euro" );

    }

}


