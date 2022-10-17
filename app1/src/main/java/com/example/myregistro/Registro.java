package com.example.myregistro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    EditText usuar,contra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        usuar=(EditText)findViewById(R.id.usuarioId);
        contra=(EditText)findViewById(R.id.contraseñaId);

    }

    public void validar(View v){
        if (registrar())
        {
            Toast.makeText(this, "Inicia sesión para continuar", Toast.LENGTH_LONG);
        }
    }

    public boolean registrar()
    {
        boolean retorno = true;

        String c1=usuar.getText().toString();
        String c2=contra.getText().toString();
        if(c1.isEmpty()){
            usuar.setError("Este es un campo obligatorio");
            retorno= false;
        }
        if(c2.isEmpty()){
            contra.setError("Este es un campo obligatorio");
            retorno=false;
        }

        return retorno;
    }
}