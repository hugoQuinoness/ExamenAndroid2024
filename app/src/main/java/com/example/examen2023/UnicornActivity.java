package com.example.examen2023;
//En main activity hay un botón que no hace nada, si consigues que al pulsarlo entres en esta activity y los unicornios tengan los siguientes nombres: uni1-Twilight Sparkle uni2-Pinkie Pie uni3-Applejack uni4-Rainbow Dash tendrás un punto extra.
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class UnicornActivity extends AppCompatActivity {
TextView uni1, uni2, uni3, uni4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unicorn);

        uni1=findViewById(R.id.tUnicorn1);
        uni2=findViewById(R.id.tUnicorn1);
        uni3=findViewById(R.id.tUnicorn3);
        uni4=findViewById(R.id.tUnicorn1);
        Intent i=getIntent();

        int unicornio=i.getIntExtra("unicornÍo",1);
        String nombre=i.getStringExtra("nombre");

        switch(unicornio){
            case 1:
                uni1.setText(nombre);
                break;
            case 2:
                uni2.setText(nombre);
                break;
            case 3:
                uni3.setText(nombre);
                break;
            case 4:
                uni4.setText(nombre);
                break;
        }


    }
}