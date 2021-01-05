package com.example.singleviewapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //App hecha el 04/01/2021

    //se cambia el título que sale en la actividad arriba


    // Método que imprime el input que se puso despúes de haber presionado un botón
    public void imprimirResultados(View view){

        /*lo que se hace en la líneas 25 - 33 es  declarar en el archivo de java los
        widgets para usarlos dentro del archivo y agregar lógica a la app.
         */

        // Los textViews son los que despligan información como los labels en Xcode
        TextView lblMarca = findViewById(R.id.lblMarca);
        TextView lblColor = findViewById(R.id.lblColor);
        TextView lblPrecio = findViewById(R.id.lblPrecio);

        // Los editText son los views que reciben input del usuario en forma de texto
        EditText txtMarca = findViewById(R.id.txtMarca);
        EditText txtColor = findViewById(R.id.txtColor);
        EditText txtPrecio = findViewById(R.id.txtPrecio);

        //Estas lineas imprimen en los Textviews los valores que se guardaron en las variables
        // que tienen txt de prefijo. Se utiliza el método .setText()

        lblMarca.setText("Marca: " + txtMarca.getText().toString());
        lblColor.setText("Color: " + txtColor.getText().toString());
        lblPrecio.setText("Precio: " + txtPrecio.getText().toString());

    }


}