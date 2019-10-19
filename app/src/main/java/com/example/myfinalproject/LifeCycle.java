package com.example.myfinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class LifeCycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("msg","onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("msg","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("msg","onStop");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("msg","onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("msg","onDestroy");
    }
}
