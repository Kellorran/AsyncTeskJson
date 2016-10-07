package com.example.ifpb.asyncteskjson.Listeners;

import android.content.Intent;
import android.view.View;

import com.example.ifpb.asyncteskjson.CadastroActivity;
import com.example.ifpb.asyncteskjson.MainActivity;

/**
 * Created by IFPB on 07/10/2016.
 */
public class OnClickTelaCadastrar implements View.OnClickListener{

    MainActivity mainActivity;

    public OnClickTelaCadastrar(MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this.mainActivity, CadastroActivity.class);
        this.mainActivity.startActivity(intent);

    }
}
