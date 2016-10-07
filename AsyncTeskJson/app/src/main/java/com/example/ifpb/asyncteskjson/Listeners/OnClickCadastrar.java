package com.example.ifpb.asyncteskjson.Listeners;

import android.view.View;
import android.widget.Toast;

import com.example.ifpb.asyncteskjson.AsyncTasks.CadastroAsyncTesk;
import com.example.ifpb.asyncteskjson.CadastroActivity;
import com.example.ifpb.asyncteskjson.MainActivity;

import java.util.concurrent.ExecutionException;

/**
 * Created by IFPB on 07/10/2016.
 */
public class OnClickCadastrar implements View.OnClickListener{

    private CadastroActivity activity;

    public OnClickCadastrar(CadastroActivity cadastroActivity) {
        this.activity = activity;
    }

    @Override
    public void onClick(View v) {
        CadastroAsyncTesk cadastro = new CadastroAsyncTesk();

        try {
            String msg = cadastro.execute(activity.getPessoa()).get();
            Toast toast = Toast.makeText(activity, msg, Toast.LENGTH_SHORT);
            activity.limparCampoTexto();

        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }


    }
}
