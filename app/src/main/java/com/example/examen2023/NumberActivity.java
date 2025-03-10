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
    int number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        txt=findViewById(R.id.tNumber);
        txt.setText(""+number);

        bPlus=findViewById(R.id.bNumberPlus);
        bPlus.setOnClickListener(this);
        bSend=findViewById(R.id.bNumberSend);
        bSend.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bNumberPlus:
                number++;
                txt.setText(String.valueOf(number));
                break;

            case R.id.bNumberSend:
                Intent resultIntent = new Intent();
                resultIntent.putExtra("Número", number);
                setResult(RESULT_OK, resultIntent);
                finish();
                break;

        }
    }
}