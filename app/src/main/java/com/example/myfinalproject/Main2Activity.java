package com.example.myfinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    RadioGroup group;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        group=findViewById(R.id.rgSubject);
        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rbAndroid)
                {
                    Toast.makeText(Main2Activity.this, "This is  Android", Toast.LENGTH_SHORT).show();
                }
                else if(i == R.id.rbwebApi)
                {
                    Toast.makeText(Main2Activity.this, "This is  Web Api", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    Toast.makeText(Main2Activity.this, "This is  IOT", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}
