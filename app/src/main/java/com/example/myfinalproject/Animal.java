package com.example.myfinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Animal extends AppCompatActivity implements View.OnClickListener{

    RadioGroup animal;
    RadioButton btnSnake,btnBird,btnTiger;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);

        animal=findViewById(R.id.rgAnimal);
        image= findViewById(R.id.imageView);
        btnBird=findViewById(R.id.rbBird);
        btnSnake=findViewById(R.id.rbSnake);
        btnTiger=findViewById(R.id.rbTiger);

        btnBird.setOnClickListener(this);
        btnSnake.setOnClickListener(this);
        btnTiger.setOnClickListener(this);




//        animal.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup radioGroup, int i) {
//                if (i == R.id.rbBird)
//                {
//                    image.setImageResource(R.drawable.bird);
//                }
//                else if (i == R.id.rbSnake)
//                {
//                    image.setImageResource(R.drawable.snake);
//                }
//                else if (i == R.id.rbTiger)
//                {
//                    image.setImageResource(R.drawable.tiger);
//                }
//            }
//        });
//

    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.rbBird:
                image.setImageResource(R.drawable.bird);
                break;
            case R.id.rbTiger :
                image.setImageResource(R.drawable.tiger);
                break;
            case R.id.rbSnake :
                image.setImageResource(R.drawable.snake);
                break;
        }

    }
}
