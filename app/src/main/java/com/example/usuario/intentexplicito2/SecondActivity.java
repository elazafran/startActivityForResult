package com.example.usuario.intentexplicito2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{
    Intent intentRecibir;
    TextView mensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button boton=(Button)findViewById(R.id.button2);
        boton.setOnClickListener(this);

        intentRecibir =  getIntent();

        String cadena = (String)intentRecibir.getExtras().get("miNombre");
        mensaje=(TextView)findViewById(R.id.textView);
        String despedida = (String)mensaje.getText();
        mensaje.setText(despedida + " " + cadena);
    }

    @Override
    public void onClick(View v) {

        intentRecibir.putExtra("retorno", "Venimos de la Pantalla2");
        setResult(RESULT_OK, intentRecibir);
        finish();
    }
}
