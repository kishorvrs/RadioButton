package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatRadioButton;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup=(RadioGroup)findViewById(R.id.radioGroup_id);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){

                    case R.id.radiobutton1_id:
                        Toast.makeText(getApplicationContext(),"Radio button 1",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.radiobutton2_id:
                        Toast.makeText(getApplicationContext(),"Radio button 2",Toast.LENGTH_LONG).show();

                        break;
                }
            }
        });


    }
}
