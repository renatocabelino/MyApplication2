package com.example.cabelino.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private Button botao1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botao1 = (Button) findViewById(R.id.button);
        botao1.setText("este é o botao 1");
    }
}
