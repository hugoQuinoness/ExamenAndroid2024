package com.example.examen2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ConcatActivity extends AppCompatActivity implements View.OnClickListener{
TextView  tt;
EditText t1, t2;
Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concat);

        boton=findViewById(R.id.bConcat);

        t1=findViewById(R.id.tConcat1);
        t2=findViewById(R.id.tConcat2);
        tt=findViewById(R.id.tConcatT);
        t1.setText("Tranquil@");
        t2.setText("Todo va a ir bien");

        boton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bConcat:
            tt.setText(t1.getText().toString()+t1.getText().toString());
                break;

        }
    }
}