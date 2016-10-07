package com.example.ifpb.asyncteskjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.example.ifpb.asyncteskjson.Listeners.OnClickCadastrar;
import com.example.ifpb.asyncteskjson.Listeners.OnClickTelaCadastrar;
import com.example.ifpb.asyncteskjson.Listeners.OnClickTelaListar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button registerButton = (Button) findViewById(R.id.registerButton);
        Button listButton = (Button) findViewById(R.id.ListButton);

        registerButton.setOnClickListener(new OnClickTelaCadastrar(this));
        registerButton.setOnClickListener(new OnClickTelaListar(this));

    }
}
