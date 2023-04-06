package com.example.moneyconvert;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Temperature extends AppCompatActivity {

    EditText edit ;
    TextView result ;
    RadioGroup group ;
    RadioButton ctf , ftc ;
    Button convert ;


    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // connect java file and a layout xml file
        setContentView(R.layout.activity_temperature);





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
    public boolean onCreateOptionsMenu(Menu menu){

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);

        return true ;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.retour:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                return true ;

            case R.id.exit :
                System.exit(1);
                return true ;
        }


        return false ;
    }

    public void FarenheitFoCelcius(){
        double value = Double.parseDouble(edit.getText().toString());
        result.setText("The result is : "+(value-32)*9/5+" C");
    }
    public void CelciusToFarenheit(){
        double value = Double.parseDouble(edit.getText().toString());
        result.setText("The result is : "+9/5*value+32+" F");
    }
}
