package com.example.ifpb.asyncteskjson.AsyncTasks;

import android.os.AsyncTask;
import android.util.Log;

import com.example.ifpb.asyncteskjson.Pessoa;
import com.google.gson.Gson;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by IFPB on 07/10/2016.
 */
public class CadastroAsyncTesk extends AsyncTask <Pessoa, Void, String> {

    @Override
    protected void onPreExecute(){
        super.onPreExecute();
    }

    @Override
    protected String doInBackground(Pessoa... pessoa) {
        String msg = "";

        try {

            Gson gson = new Gson();
            String pessoas = gson.toJson(pessoa[0]);

            URL url = new URL("http://ladoss.info:8773/Convite_SERVICE/convidado/cadastrar");
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("POST");
            urlConnection.setRequestProperty("Content-Type", "application/json");
            urlConnection.connect();

            DataOutputStream data = new DataOutputStream(urlConnection.getOutputStream());

            data.writeBytes(pessoas);
            data.close();

            if(urlConnection.getResponseCode() == 200){
                msg= "Conexão bem sucedida!";
            }
            else{
                msg = "Erro! Conexão mal sucedida!";
            }

            urlConnection.disconnect();

        } catch (IOException e) {
            Log.e("Erro: ", e.getMessage());
        } finally {
            return msg;
        }

    }

    @Override
    protected void onPostExecute(String result){
        super.onPostExecute(result);
    }
}
