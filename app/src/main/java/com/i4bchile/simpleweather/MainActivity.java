package com.i4bchile.simpleweather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.i4bchile.simpleweather.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

/* TODO:

[X]1. Crear un proyecto desde el template de actividad vacía.
[x]2. Copiar los recursos entregados dentro de los directorios correspondientes.
[]3. Configurar DataBinding en archivo build.gradle y enlazar en MainActivity.
[x]4. Cambiar el layout usando background_grandient.xml como fondo.
[x]5. Crear una nueva imagen del un sol usando Vector Asset y la galería de imágenes incluida en el
SDK.
[x] 6. Agregar las vistas para cumplir con la interfaz usando ConstraintLayout. Estas son:
       [x] TextView para la ciudad
       [x] TextView para la fecha
       [x] ImageView para el clima
       [x] TextView para la temperatura
       [x TextView para la unidad de medida (grados celsius)

        En el archivo res/values/styles.xml, el estilo HeaderTextView y SubHeaderTextView pueden ser
        utilizados para la ciudad y la fecha respectivamente
[x] 7. Crear una clase DailyWeather con los atributos para ciudad, fecha, imagen de clima,
temperatura y unidad que serán utilizados en la interfaz
[] 8. Utilizar Data Binding para asignar los valores a desplegar por las vistas en MainActivity.
[] EXTRA: Agregar una vista con el tiempo para mañana


 */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        DailyWeather clima=new DailyWeather("Santiago","24/11/2020","25",getDrawable(R.drawable.ic_baseline_wb_sunny_24));
        binding.setClimaDiario(clima);
    }
}