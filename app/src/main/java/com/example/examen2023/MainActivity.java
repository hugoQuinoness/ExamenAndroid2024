package com.example.examen2023;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bNumber,bConcat;
    ImageView iUnicorn;
    TextView txt,tUnicorn;
    int unicornio=1;
    final int CODIGO_ENVIO=42;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iUnicorn=findViewById(R.id.iMain);
        iUnicorn.setOnClickListener(this);
        bNumber=findViewById(R.id.bMainDimeNumero);
        bNumber.setOnClickListener(this);

        bConcat=findViewById(R.id.bMainConcat);
        bConcat.setOnClickListener(this);

        txt=findViewById(R.id.tMainNumero);
        tUnicorn=findViewById(R.id.tMainUnicorn);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bMainDimeNumero:
                Intent i=new Intent(this, NumberActivity.class);
                startActivityForResult(i,CODIGO_ENVIO);
                break;

            case R.id.bMainConcat:
                Intent intent=new Intent(this, ConcatActivity.class);
                startActivity(intent);
                break;

            case R.id.iMain:
                Intent in=new Intent(this, UnicornActivity.class);
                in.putExtra("nombre", tUnicorn.getText().toString());
                in.putExtra("unicornio",unicornio);
                startActivity(in);
                break;


        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable @org.jetbrains.annotations.Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode==RESULT_OK && requestCode==20 && data!=null){
            int resultado=data.getExtras().getInt("Número");
            txt.setText(""+"Sorpresa!");
        }

    }

    @Override
    protected void onResume() {
        super.onResume();
        unicornio=(int)(Math.random()*4+1);
        switch(unicornio){
            case 1:
                iUnicorn.setImageDrawable(getResources().getDrawable(R.drawable.uni));
                break;
            case 2:
                iUnicorn.setImageDrawable(getResources().getDrawable(R.drawable.uni2));
                break;
            case 3:
                iUnicorn.setImageDrawable(getResources().getDrawable(R.drawable.uni4));
                break;
            case 4:
                iUnicorn.setImageDrawable(getResources().getDrawable(R.drawable.uni3));
                break;
        }
        iUnicorn.setImageDrawable(getResources().getDrawable(R.drawable.uni));
        unicornio=1;
    }
}