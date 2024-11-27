package com.example.examen2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NumberActivity extends AppCompatActivity implements View.OnClickListener{
    TextView txt;
    Button bPlus, bSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);


        txt=findViewById(R.id.tNumber);
        txt.setText(""+42);

        bPlus=findViewById(R.id.bNumberPlus);
        bPlus.setOnClickListener(this);
        bSend=findViewById(R.id.bNumberSend);
        bSend.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bNumberPlus:
                txt.setText(""+Integer.parseInt(txt.getText().toString())/2);
                break;

            case R.id.bNumberSend:
                Intent i=getIntent();
                i.putExtra("Número",42);
                this.setResult(RESULT_CANCELED,i);
                finish();
                break;

        }
    }
}