package com.example.fatih.mficalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v){
        Toast.makeText(getApplicationContext(), "This is clicked via XML method: " + ((Button) v).getText(), Toast.LENGTH_SHORT).show();
    }
}
