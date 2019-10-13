package com.example.agenda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_add_new_contact);

        EditText contacto = (EditText)findViewById(R.id.eT_Nombre);

        contacto.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                ImageView iconoContacto = (ImageView) findViewById(R.id.iconoContacto);
                Drawable d = iconoContacto.getDrawable();

                d = DrawableCompat.wrap(d);
                if(hasFocus)
                    DrawableCompat.setTint(d, ContextCompat.getColor(getApplicationContext(),R.color.colorAccent));
                else
                    DrawableCompat.setTint(d, ContextCompat.getColor(getApplicationContext(),R.color.colorIconos));
            }
        });

        EditText apellidos = (EditText)findViewById(R.id.eT_Apellido);

        apellidos.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                ImageView iconoContacto = (ImageView) findViewById(R.id.iconoContacto);
                Drawable d = iconoContacto.getDrawable();

                d = DrawableCompat.wrap(d);
                if(hasFocus)
                    DrawableCompat.setTint(d, ContextCompat.getColor(getApplicationContext(),R.color.colorAccent));
                else
                    DrawableCompat.setTint(d, ContextCompat.getColor(getApplicationContext(),R.color.colorIconos));
            }
        });

        EditText telefono = (EditText)findViewById(R.id.eT_Telefono);

        telefono.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                ImageView iconoTelefono = (ImageView) findViewById(R.id.iconoTelefono);
                Drawable d = iconoTelefono.getDrawable();

                d = DrawableCompat.wrap(d);
                if(hasFocus)
                    DrawableCompat.setTint(d, ContextCompat.getColor(getApplicationContext(),R.color.colorAccent));
                else
                    DrawableCompat.setTint(d, ContextCompat.getColor(getApplicationContext(),R.color.colorIconos));
            }
        });

        EditText correo = (EditText)findViewById(R.id.eT_email);

        correo.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                ImageView iconoCorreo = (ImageView) findViewById(R.id.iconoEmail);
                Drawable d = iconoCorreo.getDrawable();

                d = DrawableCompat.wrap(d);
                if(hasFocus)
                    DrawableCompat.setTint(d, ContextCompat.getColor(getApplicationContext(),R.color.colorAccent));
                else
                    DrawableCompat.setTint(d, ContextCompat.getColor(getApplicationContext(),R.color.colorIconos));
            }
        });





    }


}
