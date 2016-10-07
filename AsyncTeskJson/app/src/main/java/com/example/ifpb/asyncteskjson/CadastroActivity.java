package com.example.ifpb.asyncteskjson;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import com.example.ifpb.asyncteskjson.Listeners.OnClickCadastrar;

/**
 * Created by IFPB on 07/10/2016.
 */
public class CadastroActivity extends AppCompatActivity {

    private EditText nomeEditText;
    private EditText emailEditText;
    private EditText endEditText;
    private EditText cpfEditText ;

    private Pessoa pessoa;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nameEditText = (EditText) findViewById(R.id.nameEditText);
        EditText emailEditText = (EditText) findViewById(R.id.emailEditText);
        EditText adressEditText = (EditText) findViewById(R.id.AdressEditText);
        EditText cpfEditText = (EditText) findViewById(R.id.cpfEditText);

        Button submit = (Button) findViewById(R.id.submit);

        submit.setOnClickListener(new OnClickCadastrar(this));
    }

    public Pessoa getPessoa(){
        pessoa = new Pessoa(nomeEditText.getText().toString(), emailEditText.getText().toString(), endEditText.getText().toString(), cpfEditText.getText().toString());
        return this.pessoa;
    }

    public void limparCampoTexto(){
        this.nomeEditText.setText("");
        this.emailEditText.setText("");
        this.endEditText.setText("");
        this.cpfEditText.setText("");
    }


}
