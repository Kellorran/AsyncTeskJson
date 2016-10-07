package com.example.ifpb.asyncteskjson;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.ifpb.asyncteskjson.AsyncTasks.ListarAsyncTesk;

import java.util.concurrent.ExecutionException;

/**
 * Created by IFPB on 07/10/2016.
 */
public class ListarActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar);

        ListView listView = (ListView) findViewById(R.id.listView);
        ListarAsyncTesk listPessoa = new ListarAsyncTesk();

        try {

            ArrayAdapter<Pessoa> adapter = new ArrayAdapter<Pessoa>(this, android.R.layout.simple_list_item_1, listPessoa.execute("http://ladoss.info:8773/Convite_SERVICE/convidado/listar").get());
            listView.setAdapter(adapter);

        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }


    }
}
