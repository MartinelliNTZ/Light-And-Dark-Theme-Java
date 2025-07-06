package com.example.themes2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Build;
import android.os.Bundle;
import android.widget.CompoundButton;

import com.google.android.material.switchmaterial.SwitchMaterial;


public class MainActivity extends AppCompatActivity {

    // Componente visual do tipo switch (usado para alternar modos de tema)
    SwitchMaterial switchMaterial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Método chamado automaticamente quando a Activity é criada
        super.onCreate(savedInstanceState);

        // Define o layout XML que será usado na tela
        setContentView(R.layout.activity_main);

        // Conecta a variável ao SwitchMaterial definido no layout
        switchMaterial = findViewById(R.id.switchMaterial);

        // Define o que acontece quando o switch é ligado ou desligado
        switchMaterial.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Se o switch estiver desligado (isChecked == false)
                if (!isChecked) {
                    // Segue o tema do sistema (modo claro ou escuro automaticamente)
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);
                } else {
                    // Força o modo claro (independente do tema do sistema)
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                }
            }
        });
    }
}